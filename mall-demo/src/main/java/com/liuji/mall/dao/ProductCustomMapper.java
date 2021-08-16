package com.liuji.mall.dao;

import com.liuji.mall.dto.ProductResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductCustomMapper {
    //    获取一条产品信息 (ProductResult  DTO对象)
    ProductResult getProductById(@Param("id") Long id);
}
