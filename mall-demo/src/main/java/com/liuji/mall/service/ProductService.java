package com.liuji.mall.service;

import com.liuji.mall.dto.ProductParam;
import com.liuji.mall.dto.ProductResult;
import com.liuji.mall.mbg.model.Product;
import com.liuji.mall.model.ProductQueryParam;

import java.util.List;

public interface ProductService {
    List<Product> getProductListByParams(ProductQueryParam productQueryParam, Integer pageSize, Integer pageNum);

    Integer updatePublishStatus(List<Long> ids, Integer publishStatus);

    Integer updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    Integer updateNewStatus(List<Long> ids, Integer newStatus);

    Integer updateDeleteStatus(List<Long> ids, Integer deleteStatus);

    ProductResult getProductById(Long id);

    Integer updateProduct(Long id, ProductParam productParam);

    Integer createProduct(ProductParam productParam);
}
