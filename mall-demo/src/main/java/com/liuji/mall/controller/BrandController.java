package com.liuji.mall.controller;

import com.liuji.mall.common.api.CommonPage;
import com.liuji.mall.common.api.CommonResult;
import com.liuji.mall.mbg.model.Brand;
import com.liuji.mall.service.BrandService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/lists")
    @ApiOperation("获取全部品牌信息")
    public CommonResult getProductBrandList(@RequestParam(defaultValue = "5") Integer pageSize,
                                            @RequestParam(defaultValue = "1") Integer pageNum) {
        List<Brand> productBrandList = brandService.getProductBrandList(pageSize, pageNum);
        CommonPage<Brand> brandCommonPage = CommonPage.restPage(productBrandList);
        return CommonResult.success(brandCommonPage);
    }

    @PostMapping("/updateStatus")
    @ApiOperation("更新状态")
    @ApiImplicitParams({@ApiImplicitParam(name = "name", value = "状态名", allowableValues = "显示状态 ｜ 制造商状态")})
    public CommonResult updateStatus(@RequestParam @ApiParam("要更新数据的id列表") List<Long> ids,
                                     @RequestParam @ApiParam("状态值") Integer status,
                                     @RequestParam @ApiParam("要更新的状态名") String name) {
        Integer result = 0;
        switch (name) {
            case "显示状态":
                result = brandService.updateShowStatus(ids, status);
                break;
            default:
                break;
        }
        if (result > 0) return CommonResult.success(result);
        else return CommonResult.failure(result);
    }

    @DeleteMapping("/delete")
    @ApiOperation("删除品牌")
    public CommonResult deleteById(@RequestParam @ApiParam("要删除的ID") Long id) {
        Integer result = brandService.deleteById(id);
        if (result > 0) return CommonResult.success(result);
        else return CommonResult.failure(result);
    }

    @GetMapping("/get/{id}")
    @ApiOperation("获取某个品牌")
    public CommonResult getById(@PathVariable("id") Long id) {
        Brand brand = brandService.getById(id);
        return CommonResult.success(brand);
    }

    @PostMapping("/update")
    @ApiOperation("更新某个品牌")
    public CommonResult update(@RequestBody Brand brand) {
        Integer result = brandService.update(brand);
        if (result > 0) return CommonResult.success(result);
        else return CommonResult.failure(result);
    }

    @PostMapping("/add")
    @ApiOperation("添加某个品牌")
    public CommonResult add(@RequestBody Brand brand) {
        Integer result = brandService.add(brand);
        if (result > 0) return CommonResult.success(result);
        else return CommonResult.failure(result);
    }

    @GetMapping("/search")
    @ApiOperation("根据品牌名进行检索")
    public CommonResult search(@RequestParam @ApiParam("页面容量") Integer pageSize,
                               @RequestParam @ApiParam("页码") Integer pageNum,
                               @RequestParam @ApiParam("要搜索的名字") String name) {
        List<Brand> list = brandService.search(pageSize, pageNum, name);
        CommonPage<Brand> brandCommonPage = CommonPage.restPage(list);
        return CommonResult.success(brandCommonPage);
    }

}
