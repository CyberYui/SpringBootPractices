package com.example.demo;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
//import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

/**What I've done in this practice
 * [12]Using WebFlux to control MongoDB,achieve the add/delete/change/search options of datas
 * --First,to use MongoDB,Have to add dependency in pom.xml
 *   <dependency>
 * 		<groupId>org.springframework.boot</groupId>
 * 		<artifactId>spring-boot-starter-data-mongodb-reactive</artifactId>
 * 	</dependency>
 *
 * --Don't forget to install MongoDB in your computer
 * --Then config the URI of MongoDB in application.properties:
 *   spring.data.mongodb.uri=mongodb://127.0.0.1:27017/test
 *   The official using is like:
 *   spring.data.mongodb.uri=mongodb://用户名:密码@ip地址:端口号/数据库
 *
 * --If it didn't go well,like you see the exception:
 * 		[com.mongodb.MongoSocketOpenException: Exception opening socket]
 * 	--Solving this problem by two ways:
 * 	  <1>在pom.xml中把 spring-boot-starter-data-mongodb 这个依赖注释掉
 * 	  <2>在@SpringBootApplication注解后面加上(exclude = MongoAutoConfiguration.class)
 * 	  --有的是载启动类上面加上@EnableAutoConfiguration(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
 *
 * [User.class]
 * --The Entity class of Users
 *
 * [UserRepository]
 * --Use Interface ReactiveMongoRepository to control MongoDB which provided by SpringBoot
 *
 * [UserController]
 * --The controller of this whole program,including the addition/delete/change/search movement of data
 *
 * --This practice just showing how to connect MongoDB in your computer,there is no data_table to use
 *   If there are no more Exceptions and errors in control panel,like you'll see these words:
 *   :: Spring Boot ::        (v2.2.5.RELEASE)
 *
 *   2020-03-05 13:36:28.459  INFO 18128 --- [           main] com.example.demo.Application             : Starting Application on CyberHomePC with PID 18128 (started by CyberKaka in G:\SpringBoot_IDEA_WorkSpace\[12]MongoDBwithWebFlux)
 *   2020-03-05 13:36:28.461  INFO 18128 --- [           main] com.example.demo.Application             : No active profile set, falling back to default profiles: default
 *   2020-03-05 13:36:28.855  INFO 18128 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data Reactive MongoDB repositories in DEFAULT mode.
 *   2020-03-05 13:36:28.965  INFO 18128 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 106ms. Found 1 Reactive MongoDB repository interfaces.
 *   2020-03-05 13:36:28.969  INFO 18128 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data MongoDB repositories in DEFAULT mode.
 *   2020-03-05 13:36:28.970  INFO 18128 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 1ms. Found 0 MongoDB repository interfaces.
 *   2020-03-05 13:36:29.437  INFO 18128 --- [           main] org.mongodb.driver.cluster               : Cluster created with settings {hosts=[127.0.0.1:27017], mode=SINGLE, requiredClusterType=UNKNOWN, serverSelectionTimeout='30000 ms', maxWaitQueueSize=500}
 *   2020-03-05 13:36:29.658  INFO 18128 --- [           main] org.mongodb.driver.cluster               : Cluster created with settings {hosts=[127.0.0.1:27017], mode=SINGLE, requiredClusterType=UNKNOWN, serverSelectionTimeout='30000 ms', maxWaitQueueSize=500}
 *   2020-03-05 13:36:29.733  INFO 18128 --- [127.0.0.1:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:2, serverValue:7}] to 127.0.0.1:27017
 *   2020-03-05 13:36:29.736  INFO 18128 --- [127.0.0.1:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=127.0.0.1:27017, type=STANDALONE, state=CONNECTED, ok=true, version=ServerVersion{versionList=[4, 2, 3]}, minWireVersion=0, maxWireVersion=8, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=2375200}
 *   2020-03-05 13:36:29.748  INFO 18128 --- [127.0.0.1:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:1, serverValue:6}] to 127.0.0.1:27017
 *   2020-03-05 13:36:29.749  INFO 18128 --- [127.0.0.1:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=127.0.0.1:27017, type=STANDALONE, state=CONNECTED, ok=true, version=ServerVersion{versionList=[4, 2, 3]}, minWireVersion=0, maxWireVersion=8, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=1401300}
 *   2020-03-05 13:36:30.115  INFO 18128 --- [           main] o.s.b.web.embedded.netty.NettyWebServer  : Netty started on port(s): 8080
 *   2020-03-05 13:36:30.117  INFO 18128 --- [           main] com.example.demo.Application             : Started Application in 1.94 seconds (JVM running for 2.282)
 *
 *	 --Congratulation! That means the connection is correct.
 */

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
