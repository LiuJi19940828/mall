package com.liuji.mall.dao;

import com.liuji.mall.mbg.model.MemberPrice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberPriceDao {
    int insertList(@Param("list") List<MemberPrice> memberPriceList);
}
