package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * FileName:propertTest
 * Author:  CyberYui
 * Date:    2020/2/5 12:36
 * Version: New
 * Description:Using to get contents of application.yml
 * History(If needed):
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class propertTest {
    //获取配置文件中的age
    @Value("${age}")
    private int age;

    //获取配置文件中的name
    @Value("${name}")
    private String name;

    //编写相关的测试方法
    /*可能会出现以下错误
    * Caused by: mapping values are not allowed here
    * 原因:
    * yml格式的文件,有个很硬性的规定,就是每个冒号之后必须有一个空格才可以
    *
    * 中文乱码问题:
    * 总共多个地方可能导致此问题,本项目修改了以下内容
    * --pom.xml中,修改了build标签的相关内容
    * <build>
	* 	<plugins>
	* 		<plugin>
	* 			<groupId>org.springframework.boot</groupId>
	* 			<artifactId>spring-boot-maven-plugin</artifactId>
	*           ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
	* 			<!--主要修改的内容如下,设置从而防止显示中文乱码-->
	* 			<configuration>
	* 				<jvmArguments>-Dfile.encoding=UTF-8</jvmArguments>
	* 			</configuration>
	*           ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑
     * 		</plugin>
	* 	</plugins>
    * </build>
    *
    * --配置文件中,设置HTTP请求编码以及spring boot内置tomcat的编码
    *   本项目即application.yml文件
    *   配置编码集(这种格式针对application.properties,如果是yml文件,记得修改格式)
    *       spring.http.encoding.charset=UTF-8
    *       server.tomcat.uri-encoding=UTF-8
    *       spring.http.encoding.force=true
    *       spring.http.encoding.enabled=true
    *
    * --修改idea相关属性
    *   检查编译环境的编码：
    *       File --> Setttings --> Editor --> File Encodings，这下边设置三个地方的编码格式
    *           1-1.Global Encoding
    *           1-2.Project Encoding
    *           2.Path中项目对应的Encoding
    *           3.Properties Files-->Default encoding(打勾后面的复选框)
    *
    * 另外,如果是打包出现乱码
    *   在File --> Setttings --> Build,Execution,Deployment --> Build Tools --> Maven --> Runner中
    *       添加VM Options : -DarchetypeCatalog=internal -Dfile.encoding=UTF-8
    *
    * */
    @Test
    public void getAge()
    {
        System.out.println(age);
    }

    @Test
    public void getName()
    {
        System.out.println(name);
    }

    @Autowired
    private GetPersonInfoProperties getPersonInfoProperties;
    @Test
    public void getpersonproperties()
    {
        System.out.println(getPersonInfoProperties.getName()+" "+getPersonInfoProperties.getAge());
    }

}
