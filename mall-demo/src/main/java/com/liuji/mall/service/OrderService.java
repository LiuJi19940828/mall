package com.liuji.mall.service;

import com.liuji.mall.dto.OrderResult;
import com.liuji.mall.model.Order;
import com.liuji.mall.param.OrderDeliveryParam;
import com.liuji.mall.param.OrderParam;

import java.util.List;

public interface OrderService {

    String generateOrder(Order order);

    String cancelOrder(Long orderId);

    List<com.liuji.mall.mbg.model.Order> getOrderList(Integer pageSize, Integer pageNum);

    List<com.liuji.mall.mbg.model.Order> search(OrderParam orderParam);

    Integer updateOrderStatus(List<Long> ids, Integer status);

    Integer deleteById(Long id);

    Integer deleteBatch(List<Long> ids);

    Integer update(List<OrderDeliveryParam> deliveryParams);

   OrderResult getOrderById(Long id);
}
