package com.liuji.mall.controller;

import com.liuji.mall.common.api.CommonPage;
import com.liuji.mall.common.api.CommonResult;
import com.liuji.mall.dto.OrderResult;
import com.liuji.mall.model.Order;
import com.liuji.mall.param.OrderDeliveryParam;
import com.liuji.mall.param.OrderParam;
import com.liuji.mall.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/list")
    @ApiOperation("获取订单列表")
    public CommonResult getOrderList(@RequestParam(defaultValue = "5") Integer pageSize,
                                     @RequestParam(defaultValue = "1") Integer pageNum) {
        List<com.liuji.mall.mbg.model.Order> orderList = orderService.getOrderList(pageSize, pageNum);
        CommonPage<com.liuji.mall.mbg.model.Order> orderCommonPage = CommonPage.restPage(orderList);
        return CommonResult.success(orderCommonPage);
    }

    @PostMapping("/search")
    @ApiOperation("根据条件筛选订单")
    public CommonResult searchOrderList(@RequestBody OrderParam orderParam) {
        List<com.liuji.mall.mbg.model.Order> search = orderService.search(orderParam);
        CommonPage<com.liuji.mall.mbg.model.Order> orderCommonPage = CommonPage.restPage(search);
        return CommonResult.success(orderCommonPage);
    }

    @PostMapping("/updateStatus")
    @ApiOperation("更新订单状态")
    public CommonResult updateStatus(@RequestParam List<Long> ids,
                                     @RequestParam Integer status) {
        Integer result = orderService.updateOrderStatus(ids, status);
        if (result > 0) return CommonResult.success(result);
        else return CommonResult.failure(result);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation("删除某个订单")
    public CommonResult deleteById(@PathVariable("id") Long id) {
        Integer result = orderService.deleteById(id);
        if (result > 0) return CommonResult.success(result);
        else return CommonResult.failure(result);
    }

    @PostMapping("/deleteBatch")
    @ApiOperation("批量删除")
    public CommonResult deleteBatch(@RequestParam List<Long> ids) {
        Integer result = orderService.deleteBatch(ids);
        if (result > 0) return CommonResult.success(result);
        else return CommonResult.failure(result);
    }

    @PostMapping("/update")
    @ApiOperation("更新订单发货")
    public CommonResult update(@RequestBody List<OrderDeliveryParam> deliveryParams) {
        Integer result = orderService.update(deliveryParams);
        if (result > 0) return CommonResult.success(result);
        else return CommonResult.failure(result);
    }

    @GetMapping("/get/{id}")
    @ApiOperation("根据id获取订单")
    public CommonResult<OrderResult> getOrderById(@PathVariable("id") Long id) {
        OrderResult order = orderService.getOrderById(id);
        if (order != null)
            return CommonResult.success(order);
        else
            return CommonResult.failure(null);
    }
}
