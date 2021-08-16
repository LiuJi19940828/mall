package com.liuji.mall.dao;


import com.liuji.mall.mbg.model.User;

public interface UserCustomMapper {
    User selectByUsername(String username);
}
