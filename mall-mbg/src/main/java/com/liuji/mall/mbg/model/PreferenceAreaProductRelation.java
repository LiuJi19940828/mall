package com.liuji.mall.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
* this model was generated by mybatis-generator
* table:preference_area_product_relation
* author:null
* date:2021-31-09 19:08:20
*/
@ApiModel("PreferenceAreaProductRelation")
public class PreferenceAreaProductRelation implements Serializable {
    /**
    * column:id
    * data type:BIGINT
    */
    @ApiModelProperty("id")
    private Long id;

    /**
    * column:preference_area_id
    * data type:BIGINT
    */
    @ApiModelProperty("preferenceAreaId")
    private Long preferenceAreaId;

    /**
    * column:product_id
    * data type:BIGINT
    */
    @ApiModelProperty("productId")
    private Long productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table preference_area_product_relation
     *
     * @mbg.generated 2021-31-09 19:08:20
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference_area_product_relation.id
     *
     * @return the value of preference_area_product_relation.id
     *
     * @mbg.generated 2021-31-09 19:08:20
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference_area_product_relation.id
     *
     * @param id the value for preference_area_product_relation.id
     *
     * @mbg.generated 2021-31-09 19:08:20
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference_area_product_relation.preference_area_id
     *
     * @return the value of preference_area_product_relation.preference_area_id
     *
     * @mbg.generated 2021-31-09 19:08:20
     */
    public Long getPreferenceAreaId() {
        return preferenceAreaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference_area_product_relation.preference_area_id
     *
     * @param preferenceAreaId the value for preference_area_product_relation.preference_area_id
     *
     * @mbg.generated 2021-31-09 19:08:20
     */
    public void setPreferenceAreaId(Long preferenceAreaId) {
        this.preferenceAreaId = preferenceAreaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference_area_product_relation.product_id
     *
     * @return the value of preference_area_product_relation.product_id
     *
     * @mbg.generated 2021-31-09 19:08:20
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference_area_product_relation.product_id
     *
     * @param productId the value for preference_area_product_relation.product_id
     *
     * @mbg.generated 2021-31-09 19:08:20
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference_area_product_relation
     *
     * @mbg.generated 2021-31-09 19:08:20
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", preferenceAreaId=").append(preferenceAreaId);
        sb.append(", productId=").append(productId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

}