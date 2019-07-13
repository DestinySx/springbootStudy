package com.gupaoedu.study.first.firstDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: suxin
 * Date: 2019/7/14   Time: 3:07
 * Description:  注入bean
 **/
@Configuration
public class ConfigurationDemo {

    /*
    * 类似于配置《<bean id="demoClass" class="">
    * */
    @Bean
    public DemoClass demoClass(){
        // 通过spring托管对象
        return  new DemoClass();
    }
}