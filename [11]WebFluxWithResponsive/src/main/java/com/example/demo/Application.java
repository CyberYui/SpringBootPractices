package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**What I've done in this practice
 * [11]A helloworld program by using responsive WebFlux
 * --Handler is like @Controller in Spring MVC
 * --Router is like @RequestMapping in Spring MVC
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
