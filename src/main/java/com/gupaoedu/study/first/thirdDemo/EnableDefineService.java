package com.gupaoedu.study.first.thirdDemo;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: suxin
 * Date: 2019/7/14   Time: 11:23
 * Description:
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(ImportDemoSelector.class) //动态注入bean
public @interface EnableDefineService {

    Class<?>[] exclude() default {};
}