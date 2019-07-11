package com.study.studyspringboot.redis;

import com.study.studyspringboot.redis.model.User;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Date;

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

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/set")
    public String setPOJO(){

        User user = new User();
        user.setAge("18");
        user.setGender("男");
        user.setNickname("cherish");
        user.setPassword("123456");
        user.setUsername("admin");
        // 存储序列化对象
        redisTemplate.opsForValue().set("user1", user);
        // 存储对象
        stringRedisTemplate.opsForValue().set("user2",user.toString());
        return "存储对象";
    }

    @RequestMapping(value = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
    public Object getPOJO(){
        System.out.println(DurationFormatUtils.formatPeriod(new Date("2019/11").getTime(), new Date("2020/02").getTime(), "M"));
        return redisTemplate.opsForValue().get("user1");
        //return stringRedisTemplate.opsForValue().get("user1");
    }
}