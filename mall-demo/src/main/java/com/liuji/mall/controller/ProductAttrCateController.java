package com.liuji.mall.controller;

import com.liuji.mall.common.api.CommonPage;
import com.liuji.mall.common.api.CommonResult;
import com.liuji.mall.dto.ProductAttrCateResult;
import com.liuji.mall.mbg.model.ProductAttributeCategory;
import com.liuji.mall.service.ProductAttrCateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api
@RequestMapping("/productAttrCate")
public class ProductAttrCateController {

    @Autowired
    private ProductAttrCateService service;

    @GetMapping("/list")
    @ApiOperation("获取商品属性分类表数据")
    public CommonResult<CommonPage<ProductAttributeCategory>> getProductAttrCateList(@RequestParam @ApiParam("页面容量") Integer pageSize,
                                                                                     @RequestParam @ApiParam("页码数") Integer pageNum) {
        List<ProductAttributeCategory> productAttrCateList = service.getProductAttrCateList(pageSize, pageNum);
        CommonPage<ProductAttributeCategory> commonPage = CommonPage.restPage(productAttrCateList);
        return CommonResult.success(commonPage);
    }

    @GetMapping("/attr/list")
    @ApiOperation("获取属性分类及其属性值")
    public CommonResult<List<ProductAttrCateResult>> getAttrList() {
        List<ProductAttrCateResult> attrList = service.getAttrList();
        return CommonResult.success(attrList);
    }
}
