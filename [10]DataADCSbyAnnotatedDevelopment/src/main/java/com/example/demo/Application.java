package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**What I've done in this practice
 * [10]A WebFlux demo to show the add/delete/change/search of entities
 * --In this demo I've used many annotated to finish this program
 *   There are still lots of problems for me,like:
 *   --What's the meaning of these codes:
 *     //使用Flux获取0~n个对象
 *	   return Flux.fromIterable(users.entrySet().stream().map(entry->entry.getValue()).collect(Collectors.toList()));
 *	   --How to use entrySet(),why should we use these methods
 * --To use this program,you need a software like Postman to check if anything going right
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
