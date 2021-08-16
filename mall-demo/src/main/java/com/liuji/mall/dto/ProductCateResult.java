package com.liuji.mall.dto;

import com.liuji.mall.mbg.model.ProductCate;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class ProductCateResult extends ProductCate {
    @ApiModelProperty("一级菜单下的子菜单")
    List<ProductCate> subMenuList;

    public List<ProductCate> getSubMenuList() {
        return subMenuList;
    }

    public void setSubMenuList(List<ProductCate> subMenuList) {
        this.subMenuList = subMenuList;
    }
}
