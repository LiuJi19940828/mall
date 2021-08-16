//package com.liuji.mall.config.rabbitmq;
//
//import com.liuji.mall.mq.QueueEnum;
//import org.springframework.amqp.core.*;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class RabbitmqConfig {
//
//    @Bean
//    @Qualifier("orderCancelQueue")
//    public Queue getOrderCancelQueue() {
//        return new Queue(QueueEnum.ORDER_CANCEL_QUEUE.getQueueName(), true);
//    }
//
//    @Bean
//    @Qualifier("orderCancelTTLQueue")
//    public Queue getOrderCancelTTLQueue() {
//        return QueueBuilder.durable(QueueEnum.ORDER_CANCEL_TTL_QUEUE.getQueueName()).
//                withArgument("x-dead-letter-exchange", QueueEnum.ORDER_CANCEL_QUEUE.getExchange()).
//                withArgument("x-dead-letter-route-key", QueueEnum.ORDER_CANCEL_QUEUE.getRouteKey()).
//                build();
//
//    }
//
//    @Bean
//    @Qualifier("orderCancelQueueExchange")
//    public DirectExchange getOrderCancelQueueExchange() {
//        return ExchangeBuilder.directExchange(QueueEnum.ORDER_CANCEL_QUEUE.getExchange()).
//                durable(true).
//                build();
//    }
//
//    @Bean
//    @Qualifier("orderCancelTTLQueueExchange")
//    public DirectExchange getOrderCancelTTLQueueExchange() {
//        return ExchangeBuilder.directExchange(QueueEnum.ORDER_CANCEL_TTL_QUEUE.getExchange()).
//                durable(true).
//                build();
//    }
//
//    @Bean
//    public Binding orderBinding(@Qualifier("orderCancelQueueExchange") DirectExchange directExchange, @Qualifier("orderCancelQueue") Queue queue) {
//        return BindingBuilder.bind(queue).
//                to(directExchange).
//                with(QueueEnum.ORDER_CANCEL_QUEUE.getRouteKey());
//    }
//
//    @Bean
//    public Binding orderTTLBinding(@Qualifier("orderCancelTTLQueueExchange") DirectExchange directExchange, @Qualifier("orderCancelTTLQueue") Queue queue) {
//        return BindingBuilder.bind(queue).
//                to(directExchange).
//                with(QueueEnum.ORDER_CANCEL_TTL_QUEUE.getRouteKey());
//    }
//
//
//}
