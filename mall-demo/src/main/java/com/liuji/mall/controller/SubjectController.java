package com.liuji.mall.controller;

import com.liuji.mall.common.api.CommonResult;
import com.liuji.mall.mbg.model.Subject;
import com.liuji.mall.service.SubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService service;

    @GetMapping("/list")
    @ApiOperation("获取主题表全部数据")
    public CommonResult<List<Subject>> getAll() {
        List<Subject> list = service.getAll();
        return CommonResult.success(list);
    }
}
