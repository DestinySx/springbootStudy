package com.gupaoedu.study.first.secondDemo.other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: suxin
 * Date: 2019/7/14   Time: 3:43
 * Description:
 **/
@Configuration
public class OhterConfig {

    @Bean
    public OtherBean otherBean(){
        return new OtherBean();
    }
}