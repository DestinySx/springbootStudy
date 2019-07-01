package com.study.studyspringboot.returnFormat;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: suxin
 * Date: 2019/7/1   Time: 17:45
 * Description:
 **/
@RestController
public class ReturnTest {
    //http://localhost:8080/json
    @GetMapping(value = "/json",produces = MediaType.APPLICATION_JSON_VALUE)
    public ReturnSource index(){
        ReturnSource user = new ReturnSource("dalaoyang", "26", "北京");
        return user;
    }


    //http://localhost:8080/xml
    @GetMapping(value = "/xml",produces = MediaType.APPLICATION_XML_VALUE)
    public ReturnSource XML(){
        ReturnSource user = new ReturnSource("dalaoyang", "26", "北京");
        return user;
    }
}