package com.liuji.mall.controller;

import com.liuji.mall.common.api.CommonResult;
import com.liuji.mall.mbg.model.PreferenceArea;
import com.liuji.mall.service.PreferenceAreaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api
@RequestMapping("/preferenceArea")
public class PreferenceAreaController {
    @Autowired
    private PreferenceAreaService service;

    @GetMapping("/list")
    @ApiOperation("获取优选表所有数据")
    public CommonResult<List<PreferenceArea>> getAll() {
        List<PreferenceArea> list = service.getAll();
        return CommonResult.success(list);
    }
}
