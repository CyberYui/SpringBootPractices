package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**What I've done in this practice
 * [08]Practiceing how to using Hibernate-Validator in a web program
 * --I've using these things:
 *   Spring Boot,Thymeleaf,lombok,Hibernate Validator
 *   to use Hibernate-Validator,should add dependency in pom.xml
 *   like this:
 *		<dependency>
 * 			<groupId>org.hibernate.validator</groupId>
 * 			<artifactId>hibernate-validator</artifactId>
 * 		</dependency>
 *
 * --I've created six files in this program
 * --Entity Class-->User.class
 *   This class is an entity class,showing the attributes of users
 *
 * --In order to use @MyCustomConstraint,there're two files needed
 * ----MyCustomConstraint.class
 * 	   This is customize(v. 自定义;订制，订做;) annotation(n. 注解) class
 * ----MyCustomConstraintValidator.class
 *     This is customize validator class,creating to validate service logic
 *
 * --TestValidator.class
 *   This is the controller class of program,It shows how to post and get form
 *
 * --test.html and results.html
 *   This is the entrance page of this program,users have to enter their informs to this page,
 *   and then it'll check if these informs are valid,if valid,shows the results.html for user,
 *   if invalid,it'll warn users to enter valid data.
 *
 * */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
