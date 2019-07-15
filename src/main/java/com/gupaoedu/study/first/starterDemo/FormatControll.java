package com.gupaoedu.study.first.starterDemo;

import com.gupaoedu.study.HelloFormatTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: suxin
 * Date: 2019/7/14   Time: 17:43
 * Description:
 **/
@RestController
public class FormatControll {

    @Autowired
    HelloFormatTemplate helloFormatTemplate;

    @GetMapping("/format")
    public String stringFormat(){

        UserDemo userDemo = new UserDemo();
        userDemo.setName("sx");
        userDemo.setAge(18);
        return helloFormatTemplate.doFormat(userDemo);
    }
}