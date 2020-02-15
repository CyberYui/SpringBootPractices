package com.example;

import com.example.demo.MyCustomConstraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * FileName:MyCustomConstraintValidator
 * Author:  CyberYui
 * Date:    2020/2/15 15:58
 * Version: New/Changed in ***
 * Description:The validator class of DIY @---@MyCustomConstraint
 *             To finish using @MyCustomConstraint,the MyCustomConstraint.class is needed
 * History(If needed):
 */
public class MyCustomConstraintValidator implements ConstraintValidator<MyCustomConstraint,String> {
    //String为校验的类型
    @Override
    public void initialize(MyCustomConstraint myConstraint)
    {
        //在启动时执行
    }

    /**
     * @Description:自定义校验逻辑
     * */
    @Override
    public boolean isValid(String s, ConstraintValidatorContext validatorContext)
    {
        //除了北京上海,其余的都是错误内容
        if(!(s.equals("北京")||s.equals("上海")))
        {
            return false;
        }
        return true;
    }
}
