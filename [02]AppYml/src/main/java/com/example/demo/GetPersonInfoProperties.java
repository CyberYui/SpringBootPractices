package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * FileName:GetPersonInfoProperties
 * Author:  CyberYui
 * Date:    2020/2/5 12:47
 * Version: New/Changed in ***
 * Description:定义实体类,装在配置文件信息,并用于处理配置文件中相关内容为前缀的数值
 * History(If needed):
 */
@Component
@ConfigurationProperties(prefix = "personinfo") //前缀为personinfo

/*
* @Bean
*   @ConfigurationProperties(prefix = "personinfo") //前缀为personinfo
*   public GetPersonInfoProperties getPersonInfoProperties(){
*       return new GetPersonInfoProperties();
*   }
* */

public class GetPersonInfoProperties {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
