package com.liuji.mall.dao;


import com.liuji.mall.dto.ProductAttrCateResult1;
import com.liuji.mall.dto.ProductAttrCateResult2;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductAttrCateDao {
    List<ProductAttrCateResult1> getAttrList();

    List<ProductAttrCateResult2> getTypeList(@Param("type") Integer type);
}
