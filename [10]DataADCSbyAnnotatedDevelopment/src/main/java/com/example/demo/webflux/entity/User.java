package com.example.demo.webflux.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FileName:User
 * Author:  CyberYui
 * Date:    2020/3/2 14:17
 * Version: New/Changed in ***
 * Description:Entity class--User
 * History(If needed):
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id;
    private String name;
    private int age;
}
