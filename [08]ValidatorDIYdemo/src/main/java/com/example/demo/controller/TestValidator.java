package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.validation.Valid;

/**
 * FileName:TestValidator
 * Author:  CyberYui
 * Date:    2020/2/15 16:17
 * Version: New
 * Description:Controller to bind data validations
 * History(If needed):
 */

@Controller
public class TestValidator {
    @GetMapping("/test")//这里申请的是什么,下面返回的就是什么
    public String showForm(User user){
        return "test";//---返回的内容是显示在test.html中的
    }

    @GetMapping("/results")
    public String results(){
        return "results";
    }

    @PostMapping("/test")//推送的是哪个页面,出错渲染后返回的就是哪个页面
    public String checkUser(@Valid User user, BindingResult bindingResult, RedirectAttributes attr)
    {
        //特别注意:实体中的属性必须都被验证通过,否则不会验证成功
        if(bindingResult.hasErrors()){
            return "test";//---返回的内容是在test.html中提示的的
        }
        attr.addFlashAttribute("user",user);
        return "redirect:/results";
    }
}
