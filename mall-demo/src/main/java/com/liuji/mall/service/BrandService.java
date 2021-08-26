package com.liuji.mall.service;

import com.liuji.mall.mbg.model.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getBrandList();

    List<Brand> getProductBrandList(Integer pageSize, Integer pageNum);

    Integer updateShowStatus(List<Long> ids, Integer showStatus);

    Integer deleteById(Long id);

    Brand getById(Long id);

    Integer update(Brand brand);

    Integer add(Brand brand);

    List<Brand> search(Integer pageSize, Integer pageNum, String name);
}
