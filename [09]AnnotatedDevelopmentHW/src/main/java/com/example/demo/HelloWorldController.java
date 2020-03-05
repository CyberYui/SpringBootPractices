package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * FileName:HelloWorldController
 * Author:  CyberYui
 * Date:    2020/3/2 14:10
 * Version: Changed in 2020/3/3
 * Description:Developing controller of Annotated-Based Development
 */
@RestController
public class HelloWorldController {
    @GetMapping("/helloworld")
    public Mono<String> helloworld()
    {
        return Mono.just("This is WebFlux demo");
    }
}
