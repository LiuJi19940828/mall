package com.liuji.mall.controller;

import com.liuji.mall.common.api.CommonPage;
import com.liuji.mall.common.api.CommonResult;
import com.liuji.mall.dto.ProductCateResult;
import com.liuji.mall.mbg.model.ProductCate;
import com.liuji.mall.model.ProductCateWithChildrenItem;
import com.liuji.mall.service.ProductCateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api("商品分类")
@RequestMapping("/productCate")
public class ProductCateController {

    @Autowired
    private ProductCateService productCateService;

    @GetMapping("/withChildren")
    @ApiOperation("获取所有商品分类及其子类")
    public CommonResult<List<ProductCateWithChildrenItem>> getProductCateListWithChildren() {
        List<ProductCateWithChildrenItem> productCateListWithChildren = productCateService.getProductCateListWithChildren();
        return CommonResult.success(productCateListWithChildren);
    }

    @GetMapping("/list")
    @ApiOperation("获取所有一级菜单")
    public CommonResult<CommonPage<ProductCate>> getFirstMenuList(@RequestParam(defaultValue = "5") @ApiParam("页面容量") Integer pageSize,
                                                                  @RequestParam(defaultValue = "1") @ApiParam("当前页") Integer pageNum) {
        List<ProductCate> firstMenuList = productCateService.getFirstMenuList(pageSize, pageNum);
        CommonPage<ProductCate> productCateCommonPage = CommonPage.restPage(firstMenuList);
        return CommonResult.success(productCateCommonPage);
    }

    @GetMapping("/parentMenu")
    @ApiOperation("获取分类菜单信息")
    public CommonResult getParentMenuList() {
        List<ProductCate> parentMenuList = productCateService.getParentMenuList();
        return CommonResult.success(parentMenuList);
    }

    @GetMapping("/childMenu/{id}")
    @ApiOperation("获取相应的子菜单")
    public CommonResult getChildMenuList(@PathVariable("id") Long id,
                                         @RequestParam(defaultValue = "5") @ApiParam("页面容量") Integer pageSize,
                                         @RequestParam(defaultValue = "1") @ApiParam("页码") Integer pageNum) {
        List<ProductCateResult> childMenuList = productCateService.getChildMenuList(id, pageNum, pageSize);
        CommonPage<ProductCateResult> productCateCommonPage = CommonPage.restPage(childMenuList);
        return CommonResult.success(productCateCommonPage);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("删除某个分类")
    public CommonResult deleteById(@PathVariable("id") @ApiParam("要删除分类的id") Long id) {
        Integer count = productCateService.deleteById(id);
        return CommonResult.success(count);
    }

    @GetMapping("/get/{id}")
    @ApiOperation("获取某个分类")
    public CommonResult getById(@PathVariable("id") @ApiParam("要获取的分类id") Long id) {
        List<ProductCate> list = productCateService.getById(id);
        if (CollectionUtils.isEmpty(list)) {
            return CommonResult.failure(null);
        } else {
            return CommonResult.success(list);
        }
    }

    @PostMapping("/update")
    @ApiOperation("更新某个分类")
    public CommonResult update(@RequestBody ProductCate productCate) {
        Integer update = productCateService.update(productCate);
        return CommonResult.success(update);
    }

    @PostMapping("/create")
    @ApiOperation("创建某个分类")
    public CommonResult create(@RequestBody ProductCate productCate) {
        Integer create = productCateService.create(productCate);
        return CommonResult.success(create);
    }
}
