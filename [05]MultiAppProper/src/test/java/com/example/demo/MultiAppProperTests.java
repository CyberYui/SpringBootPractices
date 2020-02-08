package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * FileName:MultiAppProperTests
 * Author:  CyberYui
 * Date:    2020/2/8 15:23
 * Version: New/Changed in ***
 * Description:To get environment configuration of developing through *.properties files
 * History(If needed):
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MultiAppProperTests {
    @Value("${myenvironment.name}")
    private String name;

    @Test
    public void getMyEnvironment()
    {
        System.out.println(name);
    }

}
