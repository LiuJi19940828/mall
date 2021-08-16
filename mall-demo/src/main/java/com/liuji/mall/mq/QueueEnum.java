package com.liuji.mall.mq;

public enum QueueEnum {

    ORDER_CANCEL_QUEUE("order_cancel_direct", "order_cancel_queue", "order_cancel"),

    ORDER_CANCEL_TTL_QUEUE("order_cancel_ttl_direct", "order_cancel_ttl_queue", "order_cancel_ttl");


    private String exchange;

    private String queueName;

    private String routeKey;

    QueueEnum(String exchange, String queueName, String routeKey) {
        this.exchange = exchange;
        this.queueName = queueName;
        this.routeKey = routeKey;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getRouteKey() {
        return routeKey;
    }

    public void setRouteKey(String routeKey) {
        this.routeKey = routeKey;
    }
}
