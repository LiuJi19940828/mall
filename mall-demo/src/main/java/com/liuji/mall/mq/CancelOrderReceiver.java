package com.liuji.mall.mq;

import com.liuji.mall.service.OrderService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "order_cancel_queue")
public class CancelOrderReceiver {
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private OrderService orderService;

    @RabbitHandler
    public void handle(Long ordId) {
        System.out.println("received message" + ordId + " from order_cancel_queue");
        orderService.cancelOrder(ordId);
    }

    public void receive() {
        Long value = (Long) amqpTemplate.receiveAndConvert("order_cancel_queue");
        System.out.println(value);
    }

}
