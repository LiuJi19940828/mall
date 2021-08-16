package com.liuji.mall.dao;

import com.liuji.mall.mbg.model.ProductAttributeValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductAttributeValueDao {

    int insertList(@Param("list") List<ProductAttributeValue> productAttributeValueList);
}
