package com.liuji.mall.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CancelOrderSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    private String exchange = QueueEnum.ORDER_CANCEL_TTL_QUEUE.getExchange();

    private String routeKey = QueueEnum.ORDER_CANCEL_TTL_QUEUE.getRouteKey();

    public void send(Long orderId, final Long expiration) {
        amqpTemplate.convertAndSend(exchange, routeKey, orderId, (message -> {
            message.getMessageProperties().setExpiration(String.valueOf(expiration));
            return message;
        }));
    }
}
