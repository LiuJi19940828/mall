package com.liuji.mall.service;

public interface AuthService {
    String generateAuthCode(String telephone);

    String validateAuthCode(String telephone, String authCode);

}
