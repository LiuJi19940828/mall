package com.liuji.mall.mbg.mapper;

import com.liuji.mall.mbg.model.ProductAttributeValue;
import com.liuji.mall.mbg.model.ProductAttributeValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductAttributeValueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attribute_value
     *
     * @mbg.generated 2021-10-09 19:08:04
     */
    long countByExample(ProductAttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attribute_value
     *
     * @mbg.generated 2021-10-09 19:08:04
     */
    int deleteByExample(ProductAttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attribute_value
     *
     * @mbg.generated 2021-10-09 19:08:04
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attribute_value
     *
     * @mbg.generated 2021-10-09 19:08:04
     */
    int insert(ProductAttributeValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attribute_value
     *
     * @mbg.generated 2021-10-09 19:08:04
     */
    int insertSelective(ProductAttributeValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attribute_value
     *
     * @mbg.generated 2021-10-09 19:08:04
     */
    List<ProductAttributeValue> selectByExample(ProductAttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attribute_value
     *
     * @mbg.generated 2021-10-09 19:08:04
     */
    ProductAttributeValue selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attribute_value
     *
     * @mbg.generated 2021-10-09 19:08:04
     */
    int updateByExampleSelective(@Param("record") ProductAttributeValue record, @Param("example") ProductAttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attribute_value
     *
     * @mbg.generated 2021-10-09 19:08:04
     */
    int updateByExample(@Param("record") ProductAttributeValue record, @Param("example") ProductAttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attribute_value
     *
     * @mbg.generated 2021-10-09 19:08:04
     */
    int updateByPrimaryKeySelective(ProductAttributeValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attribute_value
     *
     * @mbg.generated 2021-10-09 19:08:04
     */
    int updateByPrimaryKey(ProductAttributeValue record);
}