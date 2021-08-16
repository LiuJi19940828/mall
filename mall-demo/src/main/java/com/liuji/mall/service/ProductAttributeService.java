package com.liuji.mall.service;

import com.liuji.mall.mbg.model.ProductAttribute;

import java.util.List;

public interface ProductAttributeService {
    List<ProductAttribute> getListByCategoryId(Long id, Integer type, Integer pageSize, Integer pageNum);
}
