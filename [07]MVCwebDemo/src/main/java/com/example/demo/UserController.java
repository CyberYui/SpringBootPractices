package com.example.demo;

import com.example.demo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * FileName:UserController
 * Author:  CyberYui
 * Date:    2020/2/14 11:25
 * Version: New/Changed in ***
 * Description:Creating to control entity class--User.class
 * History(If needed):
 */

@Controller
public class UserController {
    //映射URL地址
    @GetMapping("/mvcdemo")//申请映射,即该注解对应的hello方法,使用的网页模版是mvcdemo.html
    public ModelAndView hello()
    {
        //实例化对象
        User user=new User();
        user.setName("中南潸");
        user.setAge(29);
        //定义MVC中的视图模版
        ModelAndView modelAndView=new ModelAndView("mvcdemo");
        //传递user实体对象给视图
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
