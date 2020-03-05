package com.example.demo.controller;

import com.example.demo.webflux.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * FileName:UserController
 * Author:  CyberYui
 * Date:    2020/3/2 14:19
 * Version: New
 * Description:The controller for entity User.class
 */
@RestController     //标志本类为一个控制类
@RequestMapping(path="/user")   //设定所有请求的父路径
public class UserController {
    Map<Long, User> users = new HashMap<>();

    //@PostConstruct该注解被用来修饰一个非静态的void（）方法
    //被@PostConstruct修饰的方法会在服务器加载Servlet的时候运行，并且只会被服务器执行一次
    //PostConstruct在构造函数之后执行，init（）方法之前执行
    @PostConstruct  //依赖关系注入完成之后,执行初始化
    public void init() throws Exception
    {
        users.put(Long.valueOf(1),new User(1,"Cyber_Kaka",28));
        users.put(Long.valueOf(2),new User(2,"钟楠",22));
    }

    /**
     * 获取所有用户
     */
    @GetMapping("/list")    //申请list这一URL
    public Flux<User> getAll()
    {
        //使用Flux获取0~n个对象
        return Flux.fromIterable(users.entrySet().stream().map(entry->entry.getValue()).collect(Collectors.toList()));
    }

    /**
     * 获取单个用户
     */
    //GetMapping在WebFlux中的用法,即响应式地获取数据

    /**
     * 关于@GetMapping的官方用法
     * @RestController
     * @RequestMapping("/users")
     * public class MyRestController {
     *
     *     @GetMapping("/{user}")
     *     public Mono<User> getUser(@PathVariable Long user) {
     *         // ...
     *     }
     *
     *     @GetMapping("/{user}/customers")
     *     public Flux<Customer> getUserCustomers(@PathVariable Long user) {
     *         // ...
     *     }
     *
     *     @DeleteMapping("/{user}")
     *     public Mono<User> deleteUser(@PathVariable Long user) {
     *         // ...
     *     }
     *
     * }
     */
    //比如这里就是根据id选取用户数据
    @GetMapping("/{id}")
    public Mono<User> getUser(@PathVariable Long id)
    {
        //使用Mono获取0~1个对象
        return Mono.justOrEmpty(users.get(id));
    }

    /**
     * 创建用户
     */
    @PostMapping("")
    public Mono<ResponseEntity<String>> addUser(User user)
    {
        users.put(user.getId(),user);
        return Mono.just(new ResponseEntity<>("添加成功", HttpStatus.CREATED));
    }

    /**
     * 修改用户
     */
    @PutMapping("/{id}")
    public Mono<ResponseEntity<User>> putUser(@PathVariable Long id,User user)
    {
        user.setId(id);
        users.put(id,user);
        return Mono.just(new ResponseEntity<>(user,HttpStatus.CREATED));
    }

    /**
     * 删除用户
     */
    @DeleteMapping("/{id}")
    public Mono<ResponseEntity<String>> deleteUser(@PathVariable Long id)
    {
        users.remove(id);
        return Mono.just(new ResponseEntity<>("删除成功",HttpStatus.ACCEPTED));
    }
}
