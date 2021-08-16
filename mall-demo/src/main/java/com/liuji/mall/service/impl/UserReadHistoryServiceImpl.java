package com.liuji.mall.service.impl;

import com.liuji.mall.mongo.dao.UserReadHistoryRepository;
import com.liuji.mall.mongo.document.UserReadHistory;
import com.liuji.mall.service.UserReadHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserReadHistoryServiceImpl implements UserReadHistoryService {
    @Autowired
    private UserReadHistoryRepository userReadHistoryRepository;

    @Override
    public int create(UserReadHistory userReadHistory) {
        userReadHistory.setCreateTime(new Date());
        userReadHistoryRepository.save(userReadHistory);
        return 1;
    }

    @Override
    public int delete(List<String> ids) {
        userReadHistoryRepository.deleteAllById(ids);
        return ids.size();
    }

    @Override
    public List<UserReadHistory> search(Long userId) {
        return userReadHistoryRepository.findByUserIdOrderByCreateTimeDesc(userId);
    }
}
