package com.example.demo;

import lombok.Data;

/**
 * FileName:User
 * Author:  CyberYui
 * Date:    2020/2/14 11:22
 * Version: New/Changed in ***
 * Description:Entity class,creating for data interactivities
 * History(If needed):
 */

@Data
public class User {
    //User id
    private long id;
    //User name
    private String name;
    //User age
    private int age;
}
