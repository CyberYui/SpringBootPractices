package com.example.demo;

/***************************************
 * Copyright (C),2020-2020
 * FileName:GetPersonInfoProperties
 * Author:   CyberKaka
 * Date:      2020/1/18 14:57
 * Description:装在配置文件信息的实体类
 * History:
 * <author>      <time>          <version>       <desc>
 * 作者姓名      修改时间        版本号         描述
 ****************************************/

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "personinfo")
public class GetPersonInfoProperties {
    private String name;
    private int age;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
