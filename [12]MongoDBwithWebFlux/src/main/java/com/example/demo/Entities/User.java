package com.example.demo.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * FileName:User
 * Author:  CyberYui
 * Date:    2020/3/4 21:52
 * Version: New/Changed in ***
 * Description:The Entity class,User.class
 * History(If needed):
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String id;
    private String name;
    private int age;
}
