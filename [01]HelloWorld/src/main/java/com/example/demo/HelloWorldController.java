package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName:HelloWorldController
 * Author:  CyberYui
 * Date:    2020/2/5 11:59
 * Version: New
 * Description:The first SpringBoot Program
 * History(If needed):
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello()
    {
        return "Hello,SpringBoot!!";
    }
}
