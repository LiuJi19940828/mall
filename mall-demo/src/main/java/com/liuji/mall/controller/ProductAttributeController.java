package com.liuji.mall.controller;

import com.liuji.mall.common.api.CommonPage;
import com.liuji.mall.common.api.CommonResult;
import com.liuji.mall.mbg.model.ProductAttribute;
import com.liuji.mall.service.ProductAttributeService;
import io.swagger.annotations.*;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api
@RequestMapping("/productAttr")
public class ProductAttributeController {
    @Autowired
    private ProductAttributeService service;

    @GetMapping("/get/{id}")
    @ApiOperation("根据属性分类id获取对应的属性值数据")
    @ApiImplicitParams({@ApiImplicitParam(name = "type", value = "0表示属性 1表示参数", type = "Integer", required = true, paramType = "query")})
    public CommonResult<CommonPage<ProductAttribute>> getListByCategoryId(@PathVariable("id") Long id,
                                                                          @RequestParam(value = "type") @ApiParam("类型") Integer type,
                                                                          @RequestParam(value = "pageSize", defaultValue = "5") @ApiParam("页面容量") Integer pageSize,
                                                                          @RequestParam(value = "pageNum", defaultValue = "1") @ApiParam("页码") Integer pageNum) {
        List<ProductAttribute> list = service.getListByCategoryId(id, type, pageSize, pageNum);
        CommonPage<ProductAttribute> page = CommonPage.restPage(list);
        return CommonResult.success(page);
    }

    @PostMapping("/deleteBatch")
    @ApiOperation("批量删除")
    public CommonResult deleteBatch(@RequestParam @ApiParam("要删除的ids") List<Long> ids) {
        Integer result = service.deleteBatch(ids);
        if (result > 0) {
            return CommonResult.success(result);
        } else {
            return CommonResult.failure(result);
        }
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("删除")
    public CommonResult delete(@PathVariable("id") Long id) {
        Integer result = service.delete(id);
        if (result > 0) {
            return CommonResult.success(result);
        } else {
            return CommonResult.failure(result);
        }
    }

    @GetMapping("/attr/{id}")
    @ApiOperation("根据ID获取属性")
    public CommonResult getById(@PathVariable("id") Long id) {
        ProductAttribute p = service.getById(id);
        return CommonResult.success(p);
    }

    @PostMapping("/update/{id}")
    @ApiOperation("更新属性")
    public CommonResult update(@PathVariable("id") Long id,
                               @RequestBody ProductAttribute attribute) {
        Integer result = service.update(id, attribute);
        if (result > 0) {
            return CommonResult.success(result);
        } else
            return CommonResult.failure(result);
    }

    @PostMapping("/add")
    @ApiOperation("添加属性")
    public CommonResult add(@RequestBody ProductAttribute attribute) {
        Integer result = service.add(attribute);
        if (result > 0) {
            return CommonResult.success(result);
        } else
            return CommonResult.failure(result);
    }
}
