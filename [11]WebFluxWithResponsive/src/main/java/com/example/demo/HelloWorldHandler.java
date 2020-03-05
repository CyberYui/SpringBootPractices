package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * FileName:HelloWorldHandler
 * Author:  CyberYui
 * Date:    2020/3/3 16:51
 * Version: New/Changed in ***
 * Description:Handler for Reactive development of WebFlux,like @Controller in MVC
 * History(If needed):
 */
@Component
public class HelloWorldHandler {
    public Mono<ServerResponse> sayHelloWorld(ServerRequest serverRequest)
    {
        //对于请求给予回应,即发送一句话"This is WebFlux demo"
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN).body(Mono.just("This is WebFlux demo"),String.class);
    }
}
