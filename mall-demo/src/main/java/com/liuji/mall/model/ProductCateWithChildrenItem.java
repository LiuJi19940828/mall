package com.liuji.mall.model;

import com.liuji.mall.mbg.model.ProductCate;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class ProductCateWithChildrenItem extends ProductCate {
    @ApiModelProperty("子级分类")
    private List<ProductCate> children;

    public List<ProductCate> getChildren() {
        return children;
    }

    public void setChildren(List<ProductCate> children) {
        this.children = children;
    }
}
