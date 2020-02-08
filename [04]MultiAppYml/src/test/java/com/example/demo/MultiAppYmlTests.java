package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * FileName:MultiAppYmlTests
 * Author:  CyberYui
 * Date:    2020/2/8 15:07
 * Version: New/Changed in ***
 * Description:Testing if it going well when changed which yml file to use
 * History(If needed):
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultiAppYmlTests {
    @Value("${myenvironment.name}")
    private String name;

    @Test
    public void getMyEnvironment()
    {
        System.out.println(name);
    }
}
