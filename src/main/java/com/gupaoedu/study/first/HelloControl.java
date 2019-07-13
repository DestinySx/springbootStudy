package com.gupaoedu.study.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: suxin
 * Date: 2019/7/14   Time: 2:46
 * Description: springboot 工程快速构建
 **/

@RestController
public class HelloControl {

    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hi Suxin";
    }
}