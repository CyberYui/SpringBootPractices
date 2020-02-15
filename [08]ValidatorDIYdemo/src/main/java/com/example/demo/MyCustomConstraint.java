package com.example.demo;

import com.example.MyCustomConstraintValidator;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * FileName:MyCustomConstraint
 * Author:  CyberYui
 * Date:    2020/2/15 15:46
 * Version: New
 * Description:The class of DIY @---@MyCustomConstraint
 *             To finish using @MyCustomConstraint,the MyCustomConstraintValidator.class is needed
 * History(If needed):
 */

//限定使用范围--只能在字段上使用
@Target({ElementType.FIELD})

//表明注解的生命周期,它在代码运行时可以通过反射获取到注解
@Retention(RetentionPolicy.RUNTIME)

//@Constraint注解,里面传入了一个validatedBy字段,用来指定该注解的校验逻辑
@Constraint(validatedBy = MyCustomConstraintValidator.class)

public @interface MyCustomConstraint {
    /**
     * @Description: 错误提示
     * */
    String message() default "请输入中国政治或经济中心的城市名";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
