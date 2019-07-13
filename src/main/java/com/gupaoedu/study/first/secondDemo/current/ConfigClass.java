package com.gupaoedu.study.first.secondDemo.current;

import com.gupaoedu.study.first.secondDemo.other.OhterConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created with IntelliJ IDEA.
 * User: suxin
 * Date: 2019/7/14   Time: 3:39
 * Description:
 **/
@Configuration
@Import(OhterConfig.class)
public class ConfigClass {

    @Bean
    public DefautlClass defautlClass(){
        return new DefautlClass();
    }
}