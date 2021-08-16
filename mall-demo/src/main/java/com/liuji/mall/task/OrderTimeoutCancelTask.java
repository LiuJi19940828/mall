package com.liuji.mall.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

@Component
public class OrderTimeoutCancelTask {

    @Scheduled(cron = "0 0/10 * ? * ?")
    public void cancelTimeoutOrder() {
        // TODO:取消超时订单
        System.out.println("取消订单");
    }
}
