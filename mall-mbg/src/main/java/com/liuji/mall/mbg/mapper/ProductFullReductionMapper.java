package com.liuji.mall.mbg.mapper;

import com.liuji.mall.mbg.model.ProductFullReduction;
import com.liuji.mall.mbg.model.ProductFullReductionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductFullReductionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_full_reduction
     *
     * @mbg.generated 2021-11-09 19:08:05
     */
    long countByExample(ProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_full_reduction
     *
     * @mbg.generated 2021-11-09 19:08:05
     */
    int deleteByExample(ProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_full_reduction
     *
     * @mbg.generated 2021-11-09 19:08:05
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_full_reduction
     *
     * @mbg.generated 2021-11-09 19:08:05
     */
    int insert(ProductFullReduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_full_reduction
     *
     * @mbg.generated 2021-11-09 19:08:05
     */
    int insertSelective(ProductFullReduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_full_reduction
     *
     * @mbg.generated 2021-11-09 19:08:05
     */
    List<ProductFullReduction> selectByExample(ProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_full_reduction
     *
     * @mbg.generated 2021-11-09 19:08:05
     */
    ProductFullReduction selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_full_reduction
     *
     * @mbg.generated 2021-11-09 19:08:05
     */
    int updateByExampleSelective(@Param("record") ProductFullReduction record, @Param("example") ProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_full_reduction
     *
     * @mbg.generated 2021-11-09 19:08:05
     */
    int updateByExample(@Param("record") ProductFullReduction record, @Param("example") ProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_full_reduction
     *
     * @mbg.generated 2021-11-09 19:08:05
     */
    int updateByPrimaryKeySelective(ProductFullReduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_full_reduction
     *
     * @mbg.generated 2021-11-09 19:08:05
     */
    int updateByPrimaryKey(ProductFullReduction record);
}