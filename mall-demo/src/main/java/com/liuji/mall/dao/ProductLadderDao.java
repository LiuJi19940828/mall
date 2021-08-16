package com.liuji.mall.dao;

import com.liuji.mall.mbg.model.ProductLadder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductLadderDao {
    int insertList(@Param("list") List<ProductLadder> list);
}
