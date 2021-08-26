package com.liuji.mall.dto;

import com.liuji.mall.mbg.model.ProductAttribute;
import com.liuji.mall.mbg.model.ProductAttributeCategory;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class ProductAttrCateResult1 extends ProductAttributeCategory {

    @ApiModelProperty("属性值列表")
    List<ProductAttribute> productAttributeList;

    public List<ProductAttribute> getProductAttributeList() {
        return productAttributeList;
    }

    public void setProductAttributeList(List<ProductAttribute> productAttributeList) {
        this.productAttributeList = productAttributeList;
    }
}
