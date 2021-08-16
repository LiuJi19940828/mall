package com.liuji.mall.dto;

import com.liuji.mall.mbg.model.*;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class ProductParam extends Product {
    @ApiModelProperty("商品阶梯价格设置")
    private List<ProductLadder> productLadderList;
    @ApiModelProperty("商品满减价格设置")
    private List<ProductFullReduction> productFullReductionList;
    @ApiModelProperty("商品会员价格设置")
    private List<MemberPrice> memberPriceList;
    @ApiModelProperty("商品的sku库存信息")
    private List<SkuStock> skuStockList;
    @ApiModelProperty("商品参数以及自定义规格属性")
    private List<ProductAttributeValue> productAttributeValueList;
    @ApiModelProperty("专题和商品关系")
    private List<SubjectProductRelation> subjectProductRelationList;
    @ApiModelProperty("优选专区和商品的关系")
    private List<PreferenceAreaProductRelation> preferenceAreaProductRelationList;

    public List<ProductLadder> getProductLadderList() {
        return productLadderList;
    }

    public void setProductLadderList(List<ProductLadder> productLadderList) {
        this.productLadderList = productLadderList;
    }

    public List<ProductFullReduction> getProductFullReductionList() {
        return productFullReductionList;
    }

    public void setProductFullReductionList(List<ProductFullReduction> productFullReductionList) {
        this.productFullReductionList = productFullReductionList;
    }

    public List<MemberPrice> getMemberPriceList() {
        return memberPriceList;
    }

    public void setMemberPriceList(List<MemberPrice> memberPriceList) {
        this.memberPriceList = memberPriceList;
    }

    public List<SkuStock> getSkuStockList() {
        return skuStockList;
    }

    public void setSkuStockList(List<SkuStock> skuStockList) {
        this.skuStockList = skuStockList;
    }

    public List<ProductAttributeValue> getProductAttributeValueList() {
        return productAttributeValueList;
    }

    public void setProductAttributeValueList(List<ProductAttributeValue> productAttributeValueList) {
        this.productAttributeValueList = productAttributeValueList;
    }

    public List<SubjectProductRelation> getSubjectProductRelationList() {
        return subjectProductRelationList;
    }

    public void setSubjectProductRelationList(List<SubjectProductRelation> subjectProductRelationList) {
        this.subjectProductRelationList = subjectProductRelationList;
    }

    public List<PreferenceAreaProductRelation> getPreferenceAreaProductRelationList() {
        return preferenceAreaProductRelationList;
    }

    public void setPreferenceAreaProductRelationList(List<PreferenceAreaProductRelation> preferenceAreaProductRelationList) {
        this.preferenceAreaProductRelationList = preferenceAreaProductRelationList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductParam that = (ProductParam) o;

        if (productLadderList != null ? !productLadderList.equals(that.productLadderList) : that.productLadderList != null)
            return false;
        if (productFullReductionList != null ? !productFullReductionList.equals(that.productFullReductionList) : that.productFullReductionList != null)
            return false;
        if (memberPriceList != null ? !memberPriceList.equals(that.memberPriceList) : that.memberPriceList != null)
            return false;
        if (skuStockList != null ? !skuStockList.equals(that.skuStockList) : that.skuStockList != null) return false;
        if (productAttributeValueList != null ? !productAttributeValueList.equals(that.productAttributeValueList) : that.productAttributeValueList != null)
            return false;
        if (subjectProductRelationList != null ? !subjectProductRelationList.equals(that.subjectProductRelationList) : that.subjectProductRelationList != null)
            return false;
        return preferenceAreaProductRelationList != null ? preferenceAreaProductRelationList.equals(that.preferenceAreaProductRelationList) : that.preferenceAreaProductRelationList == null;
    }

    @Override
    public int hashCode() {
        int result = productLadderList != null ? productLadderList.hashCode() : 0;
        result = 31 * result + (productFullReductionList != null ? productFullReductionList.hashCode() : 0);
        result = 31 * result + (memberPriceList != null ? memberPriceList.hashCode() : 0);
        result = 31 * result + (skuStockList != null ? skuStockList.hashCode() : 0);
        result = 31 * result + (productAttributeValueList != null ? productAttributeValueList.hashCode() : 0);
        result = 31 * result + (subjectProductRelationList != null ? subjectProductRelationList.hashCode() : 0);
        result = 31 * result + (preferenceAreaProductRelationList != null ? preferenceAreaProductRelationList.hashCode() : 0);
        return result;
    }

}
