package com.example.demo.Controller;

import com.example.demo.Entities.User;
import com.example.demo.Interface.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import java.awt.*;
import java.time.Duration;

/**
 * FileName:UserController
 * Author:  CyberYui
 * Date:    2020/3/4 21:56
 * Version: New/Changed in ***
 * Description:The WebFlux controller for entity class--User.class
 * History(If needed):
 */
@RestController
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/list")
    public Flux<User> getAll()
    {
        return userRepository.findAll();
    }

    //启动测试之后,就会发现查询结果是一个一个出来的,而不是一次性返回
    //媒体类型必须是 APPLICATION_STREAM_JSON_VALUE 否则调用端无法滚动得到结果,将一直阻塞直到数据流结束或超时
    @GetMapping(value = "/listdelay",produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<User> getAlldelay(){
        return userRepository.findAll().delayElements(Duration.ofSeconds(1));//Duration.ofSeconds(1)代表一秒一秒地返回数据
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<User>> getUser(@PathVariable String id)
    {
        //ResponseEntity.ok--ResponseEntity继承了HTTPEntity,是HttpEntity的子类,且可以添加HttpStatus状态码
        return userRepository.findById(id).map(getUser->ResponseEntity.ok(getUser)).defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping("")
    public Mono<User> createUser(@Valid User user)
    {
        return userRepository.save(user);
    }

    @PutMapping("/{id}")
    public Mono updateUser(@PathVariable(value = "id") String id,@Valid User user)
    {
        //flatMap返回的是迭代器中的元素
        //HttpStatus.OK代表HTTP状态是200,即表示处理成功
        //HttpStatus.NOT_FOUND代表HTTP状态是404,即表示没有找到
        return userRepository.findById(id).flatMap(
                        existingUser-> {
                            existingUser.setName(user.getName());
                            return userRepository.save(existingUser);
                        }
                ).map(updateUser->new ResponseEntity<>(updateUser, HttpStatus.OK)).defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public Mono<ResponseEntity<Void>> deleteUser(@PathVariable(value = "id") String id)
    {
        return userRepository.findById(id).flatMap(
                existingUser->userRepository.delete(existingUser).then(Mono.just(new ResponseEntity<Void>(HttpStatus.OK)))
        ).defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
