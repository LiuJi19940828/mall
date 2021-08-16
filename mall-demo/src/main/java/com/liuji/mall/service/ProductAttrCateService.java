package com.liuji.mall.service;

import com.liuji.mall.dto.ProductAttrCateResult;
import com.liuji.mall.mbg.model.ProductAttributeCategory;

import java.util.List;

public interface ProductAttrCateService {
    List<ProductAttributeCategory> getProductAttrCateList(Integer pageSize, Integer pageNum);

    List<ProductAttrCateResult> getAttrList();
}
