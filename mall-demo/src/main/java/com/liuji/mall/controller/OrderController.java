package com.liuji.mall.controller;

import com.liuji.mall.model.Order;
import com.liuji.mall.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api("order controller")
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/generate")
    @ApiOperation("生成订单")
    public String generateOrder(@RequestBody @ApiParam("订单信息") Order order) {
        return orderService.generateOrder(order);
    }

    @PostMapping("/cancel")
    @ApiOperation("取消订单")
    public String cancelOrder(@RequestParam("orderId") @ApiParam("订单id") Long orderId) {
        return orderService.cancelOrder(orderId);
    }
}
