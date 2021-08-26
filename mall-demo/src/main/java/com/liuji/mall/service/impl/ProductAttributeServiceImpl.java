package com.liuji.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.liuji.mall.mbg.mapper.ProductAttributeMapper;
import com.liuji.mall.mbg.model.ProductAttribute;
import com.liuji.mall.mbg.model.ProductAttributeExample;
import com.liuji.mall.service.ProductAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductAttributeServiceImpl implements ProductAttributeService {
    @Autowired
    private ProductAttributeMapper mapper;

    @Override
    public List<ProductAttribute> getListByCategoryId(Long id, Integer type, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        ProductAttributeExample example = new ProductAttributeExample();
        ProductAttributeExample.Criteria criteria = example.createCriteria();
        criteria.andProductAttributeCategoryIdEqualTo(id);
        criteria.andTypeEqualTo(type);
        return mapper.selectByExample(example);
    }

    @Override
    public Integer deleteBatch(List<Long> ids) {
        ProductAttributeExample example = new ProductAttributeExample();
        example.createCriteria().andIdIn(ids);
        return mapper.deleteByExample(example);
    }

    @Override
    public Integer delete(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public ProductAttribute getById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer update(Long id, ProductAttribute attribute) {
        ProductAttributeExample example = new ProductAttributeExample();
        example.createCriteria().andIdEqualTo(id);
        return mapper.updateByExampleSelective(attribute, example);
    }

    @Override
    public Integer add(ProductAttribute attribute) {
        attribute.setId(null);
        return mapper.insertSelective(attribute);
    }
}
