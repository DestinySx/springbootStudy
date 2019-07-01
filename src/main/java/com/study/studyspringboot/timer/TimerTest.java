package com.study.studyspringboot.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: suxin
 * Date: 2019/7/1   Time: 17:03
 * Description:
 **/
@Component
public class TimerTest {

    @Scheduled(cron = "0/1 * * * * ?")
    // http://cron.qqe2.com/   配置定时时间你好
    private void test() {
        System.out.println("执行定时任务的时间是："+new Date());

    }
}