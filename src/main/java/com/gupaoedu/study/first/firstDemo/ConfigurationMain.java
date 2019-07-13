package com.gupaoedu.study.first.firstDemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: suxin
 * Date: 2019/7/14   Time: 3:11
 * Description:
 **/
@SpringBootApplication
public class ConfigurationMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationDemo.class);
        DemoClass demoClass = applicationContext.getBean(DemoClass.class);
        System.out.print(demoClass.say());
    }
}