package com.liuji.mall.mongo.dao;

import com.liuji.mall.mongo.document.UserReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserReadHistoryRepository extends MongoRepository<UserReadHistory, String> {
    List<UserReadHistory> findByUserIdOrderByCreateTimeDesc(Long userId);
}
