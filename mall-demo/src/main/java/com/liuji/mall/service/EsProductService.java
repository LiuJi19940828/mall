package com.liuji.mall.service;

import com.liuji.mall.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EsProductService {
    int importAll();

    void delete(Long id);

    EsProduct create(Long id);

    void deleteByIds(List<Long> ids);

    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);

    Page<EsProduct> searchByName(String keyword, Integer pageNum, Integer pageSize);
}
