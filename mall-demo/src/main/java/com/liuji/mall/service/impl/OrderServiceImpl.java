package com.liuji.mall.service.impl;

import com.liuji.mall.model.Order;
import com.liuji.mall.mq.CancelOrderSender;
import com.liuji.mall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private CancelOrderSender sender;

    @Override
    public String generateOrder(Order order) {
        sendMessageToQueue(order.getOrderId());
        return "下单成功";
    }

    @Override
    public String cancelOrder(Long orderId) {
        return "取消订单";
    }


    private void sendMessageToQueue(Long orderId) {
        long expiration = 30 * 1000;
        sender.send(orderId, expiration);
    }
}
