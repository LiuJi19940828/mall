//package com.liuji.mall.controller;
//
//import com.liuji.mall.config.redis.RedisService;
//import com.liuji.mall.service.AuthService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiParam;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Api(tags = "authentication controller")
//@Controller
//@RequestMapping("/auth")
//public class AuthController {
//    @Autowired
//    private AuthService authService;
//
//    @GetMapping("/get")
//    @ApiOperation("获取验证码")
//    @ResponseBody
//    public String getAuthCode(@ApiParam("用户电话号码") @RequestParam String telephone) {
//        return authService.generateAuthCode(telephone);
//    }
//
//    @GetMapping("/validate")
//    @ApiOperation("进行验证")
//    @ResponseBody
//    public String validate(@ApiParam("用户电话号码") @RequestParam String telephone, @ApiParam("用户输入的验证码") @RequestParam String authCode) {
//        return authService.validateAuthCode(telephone, authCode);
//    }
//}
