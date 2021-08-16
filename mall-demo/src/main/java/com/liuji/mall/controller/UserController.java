package com.liuji.mall.controller;

import com.liuji.mall.mbg.model.User;
import com.liuji.mall.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "user controller")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    @ApiOperation("register")
    public String register(@RequestBody @ApiParam(type = "com.liuji.mall.mapper.model.user") User user) {
        User registerUser = userService.register(user);
        if (registerUser == null) {
            return "注册失败,存在同名用户";
        }
        return "注册成功";
    }

    @PostMapping("/login")
    @ApiOperation("login")
    public String login(@RequestBody @ApiParam(type = "com.liuji.mall.mapper.model.user") User user) {
        String token = userService.login(user.getUsername(), user.getPassword());
        return token;
    }
}
