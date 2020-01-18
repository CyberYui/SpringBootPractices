package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/****************************************
 * Copyright (C),2020-2020
 * @FileName:HelloWorldController
 * @Author:CyberKaka
 * @Date:2020/1/14[15:21]
 * Description:practice hello world in Spring Boot
 * History:None
 *****************************************/
@RestController
public class HelloWorldController {
    /*给予8080端口下的/hello目录*/
    @RequestMapping("/hello")
    public String hello(){
        return "Hello \"Spring Boot!\" ";
    }
}

