package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 第一个项目
* 项目主要是利用SpringAssist自动部署一个SpringBoot项目
* 然后做了4件事情:
* 1.建立一个HelloWorldController,使整个项目能跑起来,在8080端口上显示出hello SpringBoot
* 2.在resources下创建一个banner.txt文件,达到修改控制台中SpringBoot的显示内容
* 3.修改了application.properties文件为application.yml文件,即两种不同的SpringBoot配置方式[注:同时存在时,以.properties文件优先]
* 4.在application.yml中配置一些内容,然后编写测试,用两种不同的方式显示配置文件的内容
*	(1)在测试类中直接使用@Value注解获取配置文件内容,并用@Test注解写出相应的测试方法
* 	(2)在项目中创建实体类装载(获取)配置文件内容,然后在测试类中使用@Autowired注解自动注入然后用@Test注解直接测试
* */

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
