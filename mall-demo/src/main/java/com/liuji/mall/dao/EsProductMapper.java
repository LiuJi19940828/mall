package com.liuji.mall.dao;

import com.liuji.mall.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EsProductMapper {
    List<EsProduct> selectEsProductInfoById(@Param("id") Long id);
}
