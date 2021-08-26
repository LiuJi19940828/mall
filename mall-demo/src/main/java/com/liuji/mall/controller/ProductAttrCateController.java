package com.liuji.mall.controller;

import com.liuji.mall.common.api.CommonPage;
import com.liuji.mall.common.api.CommonResult;
import com.liuji.mall.dto.ProductAttrCateResult1;
import com.liuji.mall.dto.ProductAttrCateResult2;
import com.liuji.mall.mbg.model.ProductAttributeCategory;
import com.liuji.mall.service.ProductAttrCateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public CommonResult<List<ProductAttrCateResult1>> getAttrList() {
        List<ProductAttrCateResult1> attrList = service.getAttrList();
        return CommonResult.success(attrList);
    }

    @GetMapping("/typeList/{type}")
    @ApiOperation("获取属性分类及不同类型的值列表")
    public CommonResult getTableList(@PathVariable("type") Integer type,
                                     @RequestParam(defaultValue = "5") @ApiParam("页面容量") Integer pageSize,
                                     @RequestParam(defaultValue = "1") @ApiParam("页码数") Integer pageNum) {
        List<ProductAttrCateResult2> tableList = service.getTypeList(type, pageSize, pageNum);
        CommonPage<ProductAttrCateResult2> productAttrCateResult2CommonPage = CommonPage.restPage(tableList);
        return CommonResult.success(productAttrCateResult2CommonPage);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("删除某个属性分类")
    public CommonResult delete(@PathVariable("id") Long id) {
        Integer count = service.deleteById(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failure(count);
        }
    }
}
