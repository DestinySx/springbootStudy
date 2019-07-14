package com.gupaoedu.study.first.thirdDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: suxin
 * Date: 2019/7/14   Time: 11:34
 * Description:
 **/
@SpringBootApplication
@EnableDefineService(exclude = TwoService.class)
public class EnableDemoMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext ca =  SpringApplication.run(EnableDemoMain.class,args);

        System.out.println(ca.getBean(TwoService.class));

        System.out.println(ca.getBean(OneService.class));
    }
}