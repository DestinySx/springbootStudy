package com.study.studyspringboot.redis;

import com.study.studyspringboot.redis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: suxin
 * Date: 2019/7/2   Time: 21:03
 * Description:
 **/
@RestController
public class testRedis {


    @Autowired
    private RedisTemplate<Serializable, Object> redisTemplate;

    @RequestMapping("/set")
    public String setPOJO(){

        User user = new User();
        user.setAge("18");
        user.setGender("男");
        user.setNickname("cherish");
        user.setPassword("123456");
        user.setUsername("admin");
        redisTemplate.opsForValue().set("user1", user);
        return "存储对象";
    }

    @RequestMapping(value = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
    public Object getPOJO(){
        return redisTemplate.opsForValue().get("user1");
    }
}