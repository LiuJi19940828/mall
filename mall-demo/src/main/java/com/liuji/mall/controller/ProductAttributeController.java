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
}
