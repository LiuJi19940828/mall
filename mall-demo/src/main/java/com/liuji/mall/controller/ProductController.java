package com.liuji.mall.controller;

import com.github.pagehelper.PageInfo;
import com.liuji.mall.common.api.CommonPage;
import com.liuji.mall.common.api.CommonResult;
import com.liuji.mall.dto.ProductParam;
import com.liuji.mall.dto.ProductResult;
import com.liuji.mall.mbg.model.Product;
import com.liuji.mall.model.ProductQueryParam;
import com.liuji.mall.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    @ApiOperation("获取商品列表")
    public CommonResult<CommonPage<Product>> getProductList(@ApiParam(value = "查询商品参数", type = "com.liuji.mall.model.ProductParam") ProductQueryParam productQueryParam,
                                                            @RequestParam(value = "pageSize", defaultValue = "5") @ApiParam("页面容量") Integer pageSize,
                                                            @RequestParam(value = "pageNum", defaultValue = "1") @ApiParam("页码数") Integer pageNum) {
        List<Product> productList = productService.getProductListByParams(productQueryParam, pageSize, pageNum);
        CommonPage<Product> productCommonPage = CommonPage.restPage(productList);
        return CommonResult.success(productCommonPage);
    }

    @PostMapping("/update/publishStatus")
    @ApiOperation("更新发布状态")
    public CommonResult<Integer> updatePublishStatus(@RequestParam @ApiParam("选中的商品id") List<Long> ids,
                                                     @RequestParam @ApiParam("发布状态") Integer publishStatus) {
        int count = productService.updatePublishStatus(ids, publishStatus);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failure(count);
        }
    }

    @PostMapping("/update/recommendStatus")
    @ApiOperation("更新推荐状态")
    public CommonResult<Integer> updateRecommendStatus(@RequestParam @ApiParam("选中的商品id") List<Long> ids,
                                                       @RequestParam @ApiParam("推荐状态") Integer recommendStatus) {
        int count = productService.updateRecommendStatus(ids, recommendStatus);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failure(count);
        }
    }

    @PostMapping("/update/newStatus")
    @ApiOperation("更新新品状态")
    public CommonResult<Integer> updateNewStatus(@RequestParam @ApiParam("选中的商品id") List<Long> ids,
                                                 @RequestParam @ApiParam("新品状态") Integer newStatus) {
        int count = productService.updateNewStatus(ids, newStatus);
        if (count > 0)
            return CommonResult.success(count);
        else
            return CommonResult.failure(count);

    }

    @PostMapping("/update/deleteStatus")
    @ApiOperation("更新删除状态")
    public CommonResult<Integer> updateDeleteStatus(@RequestParam @ApiParam("选中的商品id") List<Long> ids,
                                                    @RequestParam @ApiParam("删除状态") Integer deleteStatus) {
        int count = productService.updateDeleteStatus(ids, deleteStatus);
        if (count > 0)
            return CommonResult.success(count);
        else
            return CommonResult.failure(count);
    }

    @GetMapping("/get/{id}")
    @ApiOperation("根据id获取商品")
    public CommonResult<ProductResult> getProductById(@PathVariable @ApiParam("商品id") Long id) {
        ProductResult product = productService.getProductById(id);
        if (product != null)
            return CommonResult.success(product);
        else
            return CommonResult.failure(product);
    }

    @PostMapping("/update/{id}")
    @ApiOperation("更新商品信息")
    public CommonResult updateProduct(@PathVariable("id") @ApiParam("商品id") Long id,
                                      @RequestBody @ApiParam("前端form作为请求参数") ProductParam productParam) {
        Integer count = productService.updateProduct(id, productParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failure(count);
        }
    }

    @PostMapping("/create")
    @ApiOperation("创建商品")
    public CommonResult createProduct(@RequestBody @ApiParam("前端form作为请求参数") ProductParam productParam) {
        Integer count = productService.createProduct(productParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failure(count);
        }
    }

}
