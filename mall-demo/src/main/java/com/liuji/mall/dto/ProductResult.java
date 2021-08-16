package com.liuji.mall.dto;

import io.swagger.annotations.ApiModelProperty;

public class ProductResult extends ProductParam {

    @ApiModelProperty("商品所选分类的父id")
    private Long cateParentId;

    public Long getCateParentId() {
        return cateParentId;
    }

    public void setCateParentId(Long cateParentId) {
        this.cateParentId = cateParentId;
    }
}
