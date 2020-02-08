package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*What I've done in this practice
 * [05]Practice using different properties files to use different development environment
 * 	--application-dev.properties is testing/developing environment
 *   --application-prod.properties is producing environment
 *   --application.properties is main configuration file,using to choose environment
 *
 * While using
 * [application-dev.properties]-->Testing to show "开发环境"
 * [application-prod.properties]-->Testing to show "生产环境"
 *
 * How to choose
 * changing "spring.profiles.active=dev" into "spring.profiles.active=prod" at application.properties
 * */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
