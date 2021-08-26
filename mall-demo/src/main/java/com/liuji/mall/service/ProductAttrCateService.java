package com.liuji.mall.service;


import com.liuji.mall.dto.ProductAttrCateResult1;
import com.liuji.mall.dto.ProductAttrCateResult2;
import com.liuji.mall.mbg.model.ProductAttributeCategory;

import java.util.List;

public interface ProductAttrCateService {
    List<ProductAttributeCategory> getProductAttrCateList(Integer pageSize, Integer pageNum);

    List<ProductAttrCateResult1> getAttrList();

    List<ProductAttrCateResult2> getTypeList(Integer type, Integer pageSize, Integer pageNum);

    Integer deleteById(Long id);


}
