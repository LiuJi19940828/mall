package com.liuji.mall.dto;

import com.liuji.mall.mbg.model.ProductAttribute;
import com.liuji.mall.mbg.model.ProductAttributeCategory;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class ProductAttrCateResult2 extends ProductAttributeCategory {

    @ApiModelProperty("属性列表 类型由参数type决定")
    private List<ProductAttribute> attributeList;


    public List<ProductAttribute> getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(List<ProductAttribute> attributeList) {
        this.attributeList = attributeList;
    }
}
