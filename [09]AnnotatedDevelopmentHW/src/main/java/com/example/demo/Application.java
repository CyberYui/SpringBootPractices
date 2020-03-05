package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**What I've done in this practice
 * [09]A demo of Annotated-based develop program
 * --Just use a Mono to show some texts,it's like a helloworld program
 */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
