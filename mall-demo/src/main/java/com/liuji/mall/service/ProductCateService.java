package com.liuji.mall.service;

import com.liuji.mall.dto.ProductCateResult;
import com.liuji.mall.mbg.model.ProductCate;
import com.liuji.mall.model.ProductCateWithChildrenItem;

import java.util.List;

public interface ProductCateService {

    List<ProductCateWithChildrenItem> getProductCateListWithChildren();

    List<ProductCate> getFirstMenuList(Integer pageSize, Integer pageNum);

    List<ProductCate> getParentMenuList();

    List<ProductCateResult> getChildMenuList(Long id, Integer pageNum, Integer pageSize);

    Integer deleteById(Long id);

    List<ProductCate> getById(Long id);

    Integer create(ProductCate productCate);

    Integer update(ProductCate productCate);

}
