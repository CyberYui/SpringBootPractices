package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * FileName:HelloWorldMvcController
 * Author:  CyberYui
 * Date:    2020/2/10 17:42
 * Version: New/Changed in ***
 * Description:The MVC Controller example 4 Thymeleaf
 * History(If needed):
 */

//标记这个类为MVC模式的控制器
@Controller
public class HelloWorldMvcController {
    //标注方法的URL映射路径
    @RequestMapping("/helloworld")
    public String helloWorld(Model model) throws Exception{
        //[自我感觉]这个函数model.addAttribute()感觉就是创建了个mav变量,然后给它赋了后面的值
        model.addAttribute("mav","Hello,Spring Boot!我是MVC结构.");

        //使用return指定参与渲染的视图
        //视图(view)的位置和名称.视图位于example文件夹下,视图文件为hello.html
        return "example/hello";
    }
}
