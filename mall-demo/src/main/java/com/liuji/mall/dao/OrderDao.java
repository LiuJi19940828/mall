package com.liuji.mall.dao;

import com.liuji.mall.dto.OrderResult;
import org.apache.ibatis.annotations.Param;

public interface OrderDao {
    OrderResult getOrderById(@Param("id") Long id);
}
