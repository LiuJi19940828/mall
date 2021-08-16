package com.liuji.mall.service.impl;

import com.liuji.mall.config.redis.RedisService;
import com.liuji.mall.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AuthServiceImpl implements AuthService {
    private String REDIS_KEY_PREFIX_AUTH_CODE = "portal:auth:";
    private Long AUTH_CODE_EXPIRE_SECONDS = Long.parseLong("120");
    @Autowired
    private RedisService redisService;

    @Override
    public String generateAuthCode(String telephone) {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            stringBuilder.append(random.nextInt(10));
        }
        redisService.set(REDIS_KEY_PREFIX_AUTH_CODE + telephone, stringBuilder.toString());
        redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE + telephone, AUTH_CODE_EXPIRE_SECONDS);
        return stringBuilder.toString();
    }

    @Override
    public String validateAuthCode(String telephone, String authCode) {
        if (authCode.isEmpty()) {
            return "请输入验证码";
        }

        String authCodeFromRedis = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + telephone);
        if (authCodeFromRedis == null) {
            return "验证码过期";
        } else if (authCode.equals(authCodeFromRedis)) {
            return "验证成功";
        } else {
            return "验证码不正确";
        }
    }
}
