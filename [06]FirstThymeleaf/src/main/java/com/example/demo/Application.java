package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*What I've done in this practice
* [06]Practice a "helloworld" mvc project by using thymeleaf and spring boot
* --Creating HelloWorldMvcController.class as the controller of "localhost:8080/helloworld"
*   In this controller,it created a variable(变量)->"mvc" and its values->"Hello,Spring Boot!我是MVC结构."
*   This controller will use the templates/examples/hello.html to render([计算机]渲染) view
* --Creating "example" folder and "hello.html"
*   Coding a simple example of using variables by thymeleaf
* --Add dependency of Thymeleaf at pom.xml
*
* --The results of this project is showing an webpage with these words"Hello,Spring Boot!我是MVC结构."
* */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
