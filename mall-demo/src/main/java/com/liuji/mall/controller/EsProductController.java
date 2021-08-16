//package com.liuji.mall.controller;
//
//import com.liuji.mall.elasticsearch.document.EsProduct;
//import com.liuji.mall.service.EsProductService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiParam;
//import io.swagger.annotations.ApiResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//@Api(tags = "es-product controller")
//@RequestMapping("/product")
//public class EsProductController {
//    @Autowired
//    private EsProductService esProductService;
//
//    @PostMapping("/import")
//    @ApiOperation("将数据库数据导入elasticsearch")
//    public int importAll() {
//        int count = esProductService.importAll();
//        return count;
//    }
//
//    @DeleteMapping("/delete/{id}")
//    @ApiOperation("根据id删除相关数据(在elasticsearch上)")
//    public void deleteById(@PathVariable("id") @ApiParam(type = "java.lang.Long") Long id) {
//        esProductService.delete(id);
//    }
//
//    @DeleteMapping("/delete/batch")
//    @ApiOperation("根据参数大量删除数据")
//    public void deleteByIds(@RequestParam("ids") @ApiParam("id list") List<Long> ids) {
//        esProductService.deleteByIds(ids);
//    }
//
//    @GetMapping("/create/{id}")
//    @ApiOperation("根据id创建数据")
//    @ApiResponse(code = 0, message = "", response = EsProduct.class)
//    public EsProduct create(@PathVariable("id") @ApiParam(type = "java.lang.Long") Long id) {
//        return esProductService.create(id);
//    }
//
//    @GetMapping("/search")
//    @ApiOperation("简单搜索")
//    public List<EsProduct> search(@RequestParam(required = false) @ApiParam("搜索的关键词") String keyword,
//                                  @RequestParam(required = false, defaultValue = "0") @ApiParam("页码设置") Integer pageNum,
//                                  @RequestParam(required = false, defaultValue = "5") @ApiParam("页面显示条数") Integer pageSize
//    ) {
//        Page<EsProduct> result = esProductService.search(keyword, pageNum, pageSize);
//        return result.get().collect(Collectors.toList());
//    }
//
//    @GetMapping("/search/name")
//    @ApiOperation("通过商品名进行搜索")
//    public List<EsProduct> searchByName(
//            @RequestParam(required = false) @ApiParam("搜索的关键词") String keyword,
//            @RequestParam(required = false, defaultValue = "0") @ApiParam("页码设置") Integer pageNum,
//            @RequestParam(required = false, defaultValue = "5") @ApiParam("页面显示条数") Integer pageSize
//    ) {
//        Page<EsProduct> esProducts = esProductService.searchByName(keyword, pageNum, pageSize);
//        List<EsProduct> list = esProducts.stream().collect(Collectors.toList());
//        return list;
//    }
//
//
//}
