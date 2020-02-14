package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*What I've done in this practice
* [07]Practice for MVC web program demo
* --Creating User.class
*   This is an entity class,very easy to understand,the @Data is an signal of lombok
* --Creating UserController.class
*   To show the User's attributes at a web-page,I created this class to instance the user object(实例化用户对象)
*   It also mapping the URL of its corresponding web-page---mvcdemo.html
* --Creating mvcdemo.html
*   It's a simple html file with Thymeleaf supporting,pay attention to ${xxx.xx},it's the way that Thymeleaf using attributes of entities
*
* [PS]There are some mistakes:
* --User.class should be put in /demo/model folder
*   In case when the program is getting bigger and bigger,it will become complex and blurring(Ving. 不清晰)
* --UserController.class should be put in /demo/controller folder
*   The reason is same as pre
* */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
