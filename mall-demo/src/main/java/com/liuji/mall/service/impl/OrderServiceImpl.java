package com.liuji.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.liuji.mall.dao.OrderDao;
import com.liuji.mall.dto.OrderResult;
import com.liuji.mall.mbg.mapper.OrderMapper;
import com.liuji.mall.mbg.model.OrderExample;
import com.liuji.mall.model.Order;
import com.liuji.mall.mq.CancelOrderSender;
import com.liuji.mall.param.OrderDeliveryParam;
import com.liuji.mall.param.OrderParam;
import com.liuji.mall.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private CancelOrderSender sender;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderDao orderDao;

    @Override
    public String generateOrder(Order order) {
        sendMessageToQueue(order.getOrderId());
        return "下单成功";
    }

    @Override
    public String cancelOrder(Long orderId) {
        return "取消订单";
    }

    @Override
    public List<com.liuji.mall.mbg.model.Order> getOrderList(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return orderMapper.selectByExample(new OrderExample());
    }

    @Override
    public List<com.liuji.mall.mbg.model.Order> search(OrderParam orderParam) {
        PageHelper.startPage(orderParam.getPageNum(), orderParam.getPageSize());
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        if (orderParam.getOrderSn() != null && orderParam.getOrderSn() != "")
            criteria.andOrderSnEqualTo(orderParam.getOrderSn());
        if (orderParam.getOrderType() != null)
            criteria.andOrderTypeEqualTo(orderParam.getOrderType());
        if (orderParam.getCreateTime() != null)
            criteria.andCreateTimeEqualTo(orderParam.getCreateTime());
        if (orderParam.getSourceType() != null)
            criteria.andSourceTypeEqualTo(orderParam.getSourceType());
        if (orderParam.getStatus() != null)
            criteria.andStatusEqualTo(orderParam.getStatus());
        if (orderParam.getReceiverKeyword() != null && orderParam.getReceiverKeyword() != "") {
            criteria.andReceiverNameLike(orderParam.getReceiverKeyword());
        }
        return orderMapper.selectByExample(orderExample);
    }

    @Override
    public Integer updateOrderStatus(List<Long> ids, Integer status) {
        com.liuji.mall.mbg.model.Order order = new com.liuji.mall.mbg.model.Order();
        order.setStatus(status);
        OrderExample orderExample = new OrderExample();
        orderExample.createCriteria().andIdIn(ids);
        return orderMapper.updateByExampleSelective(order, orderExample);
    }

    @Override
    public Integer deleteById(Long id) {
        return orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer deleteBatch(List<Long> ids) {
        OrderExample example = new OrderExample();
        example.createCriteria().andIdIn(ids);
        return orderMapper.deleteByExample(example);
    }

    @Override
    public Integer update(List<OrderDeliveryParam> deliveryParams) {
        int result = 0;
        for (OrderDeliveryParam param : deliveryParams) {
            OrderExample example = new OrderExample();
            example.createCriteria().andIdEqualTo(param.getOrderId());
            com.liuji.mall.mbg.model.Order order = new com.liuji.mall.mbg.model.Order();
            order.setDeliveryCompany(param.getDeliveryCompany());
            order.setDeliverySn(param.getDeliverySn());
            order.setStatus(3);
            orderMapper.updateByExampleSelective(order, example);
            result = 1;
        }
        return result;
    }

    @Override
    public OrderResult getOrderById(Long id) {
        return orderDao.getOrderById(id);
    }


    private void sendMessageToQueue(Long orderId) {
        long expiration = 30 * 1000;
        sender.send(orderId, expiration);
    }
}
