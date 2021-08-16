package com.liuji.mall.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

/**
* this model was generated by mybatis-generator
* table:sku_stock
* author:null
* date:2021-11-10 21:08:10
*/
@ApiModel("SkuStock")
public class SkuStock implements Serializable {
    /**
    * column:id
    * data type:BIGINT
    */
    @ApiModelProperty("id")
    private Long id;

    /**
    * column:product_id
    * data type:BIGINT
    */
    @ApiModelProperty("productId")
    private Long productId;

    /**
    * column:sku_code
    * data type:VARCHAR
    */
    @ApiModelProperty("skuCode")
    private String skuCode;

    /**
    * column:price
    * data type:DECIMAL
    */
    @ApiModelProperty("price")
    private BigDecimal price;

    /**
    * column:stock
    * data type:INTEGER
    */
    @ApiModelProperty("stock")
    private Integer stock;

    /**
    * column:low_stock
    * data type:INTEGER
    */
    @ApiModelProperty("lowStock")
    private Integer lowStock;

    /**
    * column:pic
    * data type:VARCHAR
    */
    @ApiModelProperty("pic")
    private String pic;

    /**
    * column:sale
    * data type:INTEGER
    */
    @ApiModelProperty("sale")
    private Integer sale;

    /**
    * column:promotion_price
    * data type:DECIMAL
    */
    @ApiModelProperty("promotionPrice")
    private BigDecimal promotionPrice;

    /**
    * column:lock_stock
    * data type:INTEGER
    */
    @ApiModelProperty("lockStock")
    private Integer lockStock;

    /**
    * column:sp_data
    * data type:VARCHAR
    */
    @ApiModelProperty("spData")
    private String spData;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sku_stock
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_stock.id
     *
     * @return the value of sku_stock.id
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_stock.id
     *
     * @param id the value for sku_stock.id
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_stock.product_id
     *
     * @return the value of sku_stock.product_id
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_stock.product_id
     *
     * @param productId the value for sku_stock.product_id
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_stock.sku_code
     *
     * @return the value of sku_stock.sku_code
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public String getSkuCode() {
        return skuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_stock.sku_code
     *
     * @param skuCode the value for sku_stock.sku_code
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_stock.price
     *
     * @return the value of sku_stock.price
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_stock.price
     *
     * @param price the value for sku_stock.price
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_stock.stock
     *
     * @return the value of sku_stock.stock
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_stock.stock
     *
     * @param stock the value for sku_stock.stock
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_stock.low_stock
     *
     * @return the value of sku_stock.low_stock
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public Integer getLowStock() {
        return lowStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_stock.low_stock
     *
     * @param lowStock the value for sku_stock.low_stock
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_stock.pic
     *
     * @return the value of sku_stock.pic
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_stock.pic
     *
     * @param pic the value for sku_stock.pic
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_stock.sale
     *
     * @return the value of sku_stock.sale
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public Integer getSale() {
        return sale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_stock.sale
     *
     * @param sale the value for sku_stock.sale
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public void setSale(Integer sale) {
        this.sale = sale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_stock.promotion_price
     *
     * @return the value of sku_stock.promotion_price
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_stock.promotion_price
     *
     * @param promotionPrice the value for sku_stock.promotion_price
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_stock.lock_stock
     *
     * @return the value of sku_stock.lock_stock
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public Integer getLockStock() {
        return lockStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_stock.lock_stock
     *
     * @param lockStock the value for sku_stock.lock_stock
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public void setLockStock(Integer lockStock) {
        this.lockStock = lockStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_stock.sp_data
     *
     * @return the value of sku_stock.sp_data
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public String getSpData() {
        return spData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_stock.sp_data
     *
     * @param spData the value for sku_stock.sp_data
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    public void setSpData(String spData) {
        this.spData = spData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sku_stock
     *
     * @mbg.generated 2021-11-10 21:08:10
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", skuCode=").append(skuCode);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append(", lowStock=").append(lowStock);
        sb.append(", pic=").append(pic);
        sb.append(", sale=").append(sale);
        sb.append(", promotionPrice=").append(promotionPrice);
        sb.append(", lockStock=").append(lockStock);
        sb.append(", spData=").append(spData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}