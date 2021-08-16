package com.liuji.mall.service.impl;

import com.liuji.mall.mbg.mapper.BrandMapper;
import com.liuji.mall.mbg.model.Brand;
import com.liuji.mall.mbg.model.BrandExample;
import com.liuji.mall.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> getBrandList() {
        return brandMapper.selectByExample(new BrandExample());
    }
}
