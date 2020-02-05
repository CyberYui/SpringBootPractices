package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

    /*What I've done in this practice
	* [01]Practice as HelloWorld
	* --Created the first SpringBoot application
	*   Showing "Hello,SpringBoot!!" at http://localhost/hello
	* --Created banner.txt,change the ASCII pictures in control
	* */
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
