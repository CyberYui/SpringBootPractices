package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * FileName:Router
 * Author:  CyberYui
 * Date:    2020/3/3 18:12
 * Version: New
 * Description:Providing URL,like @RequestMapping in MVC
 * History(If needed):
 */
@Configuration
public class Router {
    @Autowired
    private HelloWorldHandler helloWorldHandler;
    @Bean
    public RouterFunction<ServerResponse> getString()
    {
        //指定路径,获取/helloworld路径,请求HelloWorldHandler控制
        //并调用sayHelloWorld函数
        return route(GET("/helloworld"),req->helloWorldHandler.sayHelloWorld(req));
    }
}
