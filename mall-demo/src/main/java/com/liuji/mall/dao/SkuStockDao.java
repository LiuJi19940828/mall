package com.liuji.mall.dao;

import com.liuji.mall.mbg.model.SkuStock;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SkuStockDao {
    int insertList(@Param("list") List<SkuStock> skuStockList);

    int replaceList(@Param("list") List<SkuStock> skuStockList);
}
