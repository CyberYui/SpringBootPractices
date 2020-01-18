package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.GetMapping;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class GetPersonPropertiesTest {
	//获取配置文件中的age
	@Value("${age}")
	private int age;

	//获取配置文件中的name
	@Value("${name}")
	private String name;

	//写出两个测试方法
	@Test
	public void getAge() {
		System.out.println(age);
	}

	@Test
	public void getName() {
		System.out.println(name);
	}

	//写出方法在实体类中的测试引用例子
	@Autowired
	private GetPersonInfoProperties getPersonInfoProperties;
	@Test
	public void getpersonproperties(){
		System.out.println(getPersonInfoProperties.getName()+getPersonInfoProperties.getAge());
	}
}
