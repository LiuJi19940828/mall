package com.liuji.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.liuji.mall.dao.ProductCateCustomMapper;
import com.liuji.mall.dto.ProductCateResult;
import com.liuji.mall.mbg.mapper.ProductCateMapper;
import com.liuji.mall.mbg.model.ProductCate;
import com.liuji.mall.mbg.model.ProductCateExample;
import com.liuji.mall.model.ProductCateWithChildrenItem;
import com.liuji.mall.service.ProductCateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCateServiceImpl implements ProductCateService {
    @Autowired
    private ProductCateCustomMapper productCateCustomMapper;

    @Autowired
    private ProductCateMapper productCateMapper;

    @Override
    public List<ProductCateWithChildrenItem> getProductCateListWithChildren() {
        return productCateCustomMapper.getProductListWithChildren();
    }

    @Override
    public List<ProductCate> getFirstMenuList(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        ProductCateExample productCateExample = new ProductCateExample();
        productCateExample.createCriteria().andLevelEqualTo(0);
        return productCateMapper.selectByExample(productCateExample);
    }

    @Override
    public List<ProductCate> getParentMenuList() {
        ProductCateExample productCateExample = new ProductCateExample();
        productCateExample.createCriteria().andLevelEqualTo(0);
        return productCateMapper.selectByExample(productCateExample);
    }

    @Override
    public List<ProductCateResult> getChildMenuList(Long id, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return productCateCustomMapper.getChildMenuList(id);
    }

    @Override
    public Integer deleteById(Long id) {
        return productCateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<ProductCate> getById(Long id) {
        ProductCateExample productCateExample = new ProductCateExample();
        productCateExample.createCriteria().andIdEqualTo(id);
        return productCateMapper.selectByExample(productCateExample);
    }

    @Override
    public Integer create(ProductCate productCate) {
        productCate.setId(null);
        return productCateMapper.insertSelective(productCate);
    }

    @Override
    public Integer update(ProductCate productCate) {
        ProductCateExample example = new ProductCateExample();
        example.createCriteria().andIdEqualTo(productCate.getId());
        return productCateMapper.updateByExampleSelective(productCate, example);
    }

}
