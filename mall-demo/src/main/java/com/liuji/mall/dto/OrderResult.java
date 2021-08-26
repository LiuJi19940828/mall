package com.liuji.mall.dto;

import com.liuji.mall.mbg.model.Order;
import com.liuji.mall.mbg.model.OrderItem;
import com.liuji.mall.mbg.model.OrderOperateHistory;

import java.util.List;

public class OrderResult extends Order {

    private List<OrderItem> orderItemList;

    private List<OrderOperateHistory> orderOperateHistoryList;

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public List<OrderOperateHistory> getOrderOperateHistoryList() {
        return orderOperateHistoryList;
    }

    public void setOrderOperateHistoryList(List<OrderOperateHistory> orderOperateHistoryList) {
        this.orderOperateHistoryList = orderOperateHistoryList;
    }
}
