package com.liuji.mall.service.impl;

import com.github.pagehelper.PageHelper;
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

    @Override
    public List<Brand> getProductBrandList(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return brandMapper.selectByExample(new BrandExample());
    }

    @Override
    public Integer updateShowStatus(List<Long> ids, Integer showStatus) {
        Brand brand = new Brand();
        brand.setShowStatus(showStatus);
        BrandExample example = new BrandExample();
        example.createCriteria().andIdIn(ids);
        return brandMapper.updateByExampleSelective(brand, example);
    }

    @Override
    public Integer deleteById(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Brand getById(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer update(Brand brand) {
        BrandExample example = new BrandExample();
        example.createCriteria().andIdEqualTo(brand.getId());
        return brandMapper.updateByExampleSelective(brand, example);
    }

    @Override
    public Integer add(Brand brand) {
        brand.setId(null);
        return brandMapper.insertSelective(brand);
    }

    @Override
    public List<Brand> search(Integer pageSize, Integer pageNum, String name) {
        PageHelper.startPage(pageNum, pageSize);
        BrandExample example = new BrandExample();
        example.createCriteria().andNameLike(name);
        return brandMapper.selectByExample(example);
    }
}
