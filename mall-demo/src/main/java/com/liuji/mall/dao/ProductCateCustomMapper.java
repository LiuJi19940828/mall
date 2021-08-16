package com.liuji.mall.dao;

import com.liuji.mall.dto.ProductCateResult;
import com.liuji.mall.model.ProductCateWithChildrenItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductCateCustomMapper {
    List<ProductCateWithChildrenItem> getProductListWithChildren();

    List<ProductCateResult> getChildMenuList(@Param("id") Long id);
}
