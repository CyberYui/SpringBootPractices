package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*What I've done in this practice
* [04]Practice using different yml files to use different development environment
* 	--application-dev.yml is testing/developing environment
*   --application-prod.yml is producing environment
*   --application.yml is main configuration file,using to choose environment
*
* While using
* [application-dev.yml]-->Testing to show "开发环境"
* [application-prod.yml]-->Testing to show "生产环境"
*
* How to choose
* changing "active: dev" into "active: prod" at application.yml
* [PS]Don't forget to use " "(space) in *.yml files
* */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
