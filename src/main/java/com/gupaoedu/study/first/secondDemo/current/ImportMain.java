package com.gupaoedu.study.first.secondDemo.current;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: suxin
 * Date: 2019/7/14   Time: 3:40
 * Description:
 **/
@SpringBootApplication
public class ImportMain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigClass.class);

        String[] beansName = applicationContext.getBeanDefinitionNames();
        for(String beanName:beansName){
            System.out.println(beanName);
        }
    }
}