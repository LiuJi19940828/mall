package com.liuji.mall.service;

import com.liuji.mall.mbg.model.User;

public interface UserService {
    User getUserByUsername(String username);

    User register(User user);

    String login(String username, String password);
}
