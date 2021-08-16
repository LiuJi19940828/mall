package com.liuji.mall.mbg.mapper;

import com.liuji.mall.mbg.model.User;
import java.util.List;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    List<User> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    int updateByPrimaryKey(User record);
}