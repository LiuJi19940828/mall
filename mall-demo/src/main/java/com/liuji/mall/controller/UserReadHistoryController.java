package com.liuji.mall.controller;

import com.liuji.mall.mongo.document.UserReadHistory;
import com.liuji.mall.service.UserReadHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/history")
@Api(tags = "user read history controller")
public class UserReadHistoryController {
    @Autowired
    private UserReadHistoryService userReadHistoryService;

    @PostMapping("/create")
    @ApiOperation("创建用户浏览记录")
    public String create(@RequestBody @ApiParam(value = "用户历史记录信息", type = "com.liuji.mall.mongo.document.UserReadHistory") UserReadHistory userReadHistory) {
        int i = userReadHistoryService.create(userReadHistory);
        if (i > 0) {
            return "创建成功";
        }
        return "创建失败";
    }

    @DeleteMapping("/delete")
    @ApiOperation("删除用户浏览记录")
    public int delete(@RequestParam("ids") @ApiParam("要删除的记录id列表") List<String> ids) {
        return userReadHistoryService.delete(ids);
    }

    @GetMapping("/search")
    @ApiOperation("搜索相关用户历史记录")
    public List<UserReadHistory> search(@RequestParam("userId") @ApiParam("用户id") Long userId) {
        return userReadHistoryService.search(userId);
    }
}
