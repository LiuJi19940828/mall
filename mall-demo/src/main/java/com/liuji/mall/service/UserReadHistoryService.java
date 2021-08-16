package com.liuji.mall.service;

import com.liuji.mall.mongo.document.UserReadHistory;

import java.util.List;

public interface UserReadHistoryService {
    int create(UserReadHistory userReadHistory);

    int delete(List<String> ids);

    List<UserReadHistory> search(Long userId);

}
