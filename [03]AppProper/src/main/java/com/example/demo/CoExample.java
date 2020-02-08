package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * FileName:CoExample
 * Author:  CyberYui
 * Date:    2020/2/8 10:50
 * Version: New/Changed in ***
 * Description:Creating to get values of application.properties
 * History(If needed):
 */

@Data
@Component
@ConfigurationProperties(prefix = "com.example")
public class CoExample {
    private String name;
    private int age;
    private List<String> address;
}
