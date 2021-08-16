package com.liuji.mall.dao;

import com.liuji.mall.mbg.model.ProductFullReduction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductFullReductionDao {
    int insertList(@Param("list") List<ProductFullReduction> productFullReductionList);
}
