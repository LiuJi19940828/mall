package com.liuji.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.liuji.mall.dao.ProductAttrCateDao;

import com.liuji.mall.dto.ProductAttrCateResult1;
import com.liuji.mall.dto.ProductAttrCateResult2;
import com.liuji.mall.mbg.mapper.ProductAttributeCategoryMapper;
import com.liuji.mall.mbg.model.ProductAttributeCategory;
import com.liuji.mall.mbg.model.ProductAttributeCategoryExample;
import com.liuji.mall.service.ProductAttrCateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductAttrCateServiceImpl implements ProductAttrCateService {
    @Autowired
    private ProductAttributeCategoryMapper mapper;
    @Autowired
    private ProductAttrCateDao productAttrCateDao;

    @Override
    public List<ProductAttributeCategory> getProductAttrCateList(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        ProductAttributeCategoryExample example = new ProductAttributeCategoryExample();
        return mapper.selectByExample(example);
    }

    @Override
    public List<ProductAttrCateResult1> getAttrList() {
        return productAttrCateDao.getAttrList();
    }

    @Override
    public List<ProductAttrCateResult2> getTypeList(Integer type, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return productAttrCateDao.getTypeList(type);
    }

    @Override
    public Integer deleteById(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }
}
