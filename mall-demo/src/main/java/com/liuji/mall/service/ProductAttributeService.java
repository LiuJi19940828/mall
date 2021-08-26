package com.liuji.mall.service;

import com.liuji.mall.mbg.model.ProductAttribute;

import java.util.List;

public interface ProductAttributeService {
    List<ProductAttribute> getListByCategoryId(Long id, Integer type, Integer pageSize, Integer pageNum);

    Integer deleteBatch(List<Long> ids);

    Integer delete(Long id);

    ProductAttribute getById(Long id);

    Integer update(Long id, ProductAttribute attribute);

    Integer add(ProductAttribute attribute);
}
