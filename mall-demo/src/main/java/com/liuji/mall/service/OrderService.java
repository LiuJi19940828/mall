package com.liuji.mall.service;

import com.liuji.mall.model.Order;

public interface OrderService {

    String generateOrder(Order order);

    String cancelOrder(Long orderId);
}
