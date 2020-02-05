package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*What I've done in this practice
* [02]Practice for using application.yml
* --Deleted application.properties and created application.yml
* --Writing something in application.yml,such as changing port and Values for use
* Using two ways to get informations from application.yml
* --1--Coding tests in propertTest.class file,get the values without prefix
* --2--Creating GetPersonInfoProperties.class as entity class
* 	   Creating new test in propertTest.class to Autowired entity
* */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
