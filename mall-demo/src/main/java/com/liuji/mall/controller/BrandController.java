package com.liuji.mall.controller;

import com.liuji.mall.mbg.model.Brand;
import com.liuji.mall.service.BrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api("商品品牌")
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping("/list")
    @ApiOperation("获取全部商品品牌")
    public List<Brand> getBrandList() {
        return brandService.getBrandList();
    }

}
