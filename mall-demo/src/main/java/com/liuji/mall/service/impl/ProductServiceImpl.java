package com.liuji.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.liuji.mall.dao.*;
import com.liuji.mall.dto.ProductParam;
import com.liuji.mall.dto.ProductResult;
import com.liuji.mall.mbg.mapper.*;
import com.liuji.mall.mbg.model.*;
import com.liuji.mall.model.ProductQueryParam;
import com.liuji.mall.service.ProductService;
import net.bytebuddy.asm.Advice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductCustomMapper productCustomMapper;
    @Autowired
    private ProductLadderMapper productLadderMapper;
    @Autowired
    private ProductLadderDao productLadderDao;
    @Autowired
    private ProductFullReductionMapper productFullReductionMapper;
    @Autowired
    private ProductFullReductionDao productFullReductionDao;
    @Autowired
    private MemberPriceMapper memberPriceMapper;
    @Autowired
    private MemberPriceDao memberPriceDao;
    @Autowired
    private ProductAttributeValueMapper productAttributeValueMapper;
    @Autowired
    private ProductAttributeValueDao productAttributeValueDao;
    @Autowired
    private SubjectProductRelationMapper subjectProductRelationMapper;
    @Autowired
    private SubjectProductRelationDao subjectProductRelationDao;
    @Autowired
    private PreferenceAreaProductRelationMapper preferenceAreaProductRelationMapper;
    @Autowired
    private PreferenceAreaProductRelationDao preferenceAreaProductRelationDao;
    @Autowired
    private SkuStockMapper skuStockMapper;
    @Autowired
    private SkuStockDao skuStockDao;

    @Override
    public List<Product> getProductListByParams(ProductQueryParam productQueryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        if (productQueryParam == null) {
            return productMapper.selectByExample(new ProductExample());
        } else {
            ProductExample productExample = new ProductExample();
            ProductExample.Criteria criteria = productExample.createCriteria();
            criteria.andDeleteStatusEqualTo(0);
            if (!StringUtils.isEmpty(productQueryParam.getProductSn())) {
                criteria.andProductSnEqualTo(productQueryParam.getProductSn());
            }
            if (productQueryParam.getPublishStatus() != null) {
                criteria.andPublishStatusEqualTo(productQueryParam.getPublishStatus());
            }
            if (productQueryParam.getVerifyStatus() != null) {
                criteria.andVerifyStatusEqualTo(productQueryParam.getVerifyStatus());
            }
            if (productQueryParam.getBrandId() != null) {
                criteria.andBrandIdEqualTo(productQueryParam.getBrandId());
            }
            if (productQueryParam.getProductCategoryId() != null) {
                criteria.andProductCategoryIdEqualTo(productQueryParam.getProductCategoryId());
            }
            if (!StringUtils.isEmpty(productQueryParam.getKeyword())) {
                criteria.andNameLike("%" + productQueryParam.getKeyword() + "%");
            }
            return productMapper.selectByExample(productExample);
        }
    }

    @Override
    public Integer updatePublishStatus(List<Long> ids, Integer publishStatus) {
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        Product record = new Product();
        record.setPublishStatus(publishStatus);
        criteria.andIdIn(ids);
        return productMapper.updateByExampleSelective(record, productExample);
    }

    @Override
    public Integer updateRecommendStatus(List<Long> ids, Integer recommendStatus) {
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andIdIn(ids);
        Product record = new Product();
        record.setRecommandStatus(recommendStatus);
        return productMapper.updateByExampleSelective(record, productExample);
    }

    @Override
    public Integer updateNewStatus(List<Long> ids, Integer newStatus) {
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andIdIn(ids);
        Product record = new Product();
        record.setNewStatus(newStatus);
        return productMapper.updateByExampleSelective(record, productExample);
    }

    @Override
    public Integer updateDeleteStatus(List<Long> ids, Integer deleteStatus) {
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andIdIn(ids);
        Product record = new Product();
        record.setDeleteStatus(deleteStatus);
        return productMapper.updateByExampleSelective(record, productExample);
    }

    @Override
    public ProductResult getProductById(Long id) {
        return productCustomMapper.getProductById(id);
    }

    @Override
    public Integer updateProduct(Long id, ProductParam productParam) {
        int count = 0;
        Product product = productParam;
        product.setId(id);
        productMapper.updateByPrimaryKeySelective(product);

        ProductLadderExample productLadderExample = new ProductLadderExample();
        ProductLadderExample.Criteria ladderCriteria = productLadderExample.createCriteria();
        ladderCriteria.andProductIdEqualTo(id);
        productLadderMapper.deleteByExample(productLadderExample);
        insertForList(productLadderDao, productParam.getProductLadderList(), id);

        ProductFullReductionExample productFullReductionExample = new ProductFullReductionExample();
        ProductFullReductionExample.Criteria productFullReductionExampleCriteria = productFullReductionExample.createCriteria();
        productFullReductionExampleCriteria.andProductIdEqualTo(id);
        productFullReductionMapper.deleteByExample(productFullReductionExample);
        insertForList(productFullReductionDao, productParam.getProductFullReductionList(), id);

        MemberPriceExample memberPriceExample = new MemberPriceExample();
        memberPriceExample.createCriteria().andProductIdEqualTo(id);
        memberPriceMapper.deleteByExample(memberPriceExample);
        insertForList(memberPriceDao, productParam.getMemberPriceList(), id);

        //修改商品参数,添加自定义商品规格
        ProductAttributeValueExample productAttributeValueExample = new ProductAttributeValueExample();
        productAttributeValueExample.createCriteria().andProductIdEqualTo(id);
        productAttributeValueMapper.deleteByExample(productAttributeValueExample);
        insertForList(productAttributeValueDao, productParam.getProductAttributeValueList(), id);
        //关联专题
        SubjectProductRelationExample subjectProductRelationExample = new SubjectProductRelationExample();
        subjectProductRelationExample.createCriteria().andProductIdEqualTo(id);
        subjectProductRelationMapper.deleteByExample(subjectProductRelationExample);
        insertForList(subjectProductRelationDao, productParam.getSubjectProductRelationList(), id);
        //关联优选
        PreferenceAreaProductRelationExample preferenceAreaExample = new PreferenceAreaProductRelationExample();
        preferenceAreaExample.createCriteria().andProductIdEqualTo(id);
        preferenceAreaProductRelationMapper.deleteByExample(preferenceAreaExample);
        insertForList(preferenceAreaProductRelationDao, productParam.getPreferenceAreaProductRelationList(), id);

        SkuStockExample skuStockExample = new SkuStockExample();
        skuStockExample.createCriteria().andProductIdEqualTo(id);
        skuStockMapper.deleteByExample(skuStockExample);
        insertForList(skuStockDao, productParam.getSkuStockList(), id);
        count = 1;
        return count;
    }

    @Override
    public Integer createProduct(ProductParam productParam) {
        int count = 0;
        Product product = productParam;
        product.setId(null);
        productMapper.insertSelective(product);
        ProductExample productExample = new ProductExample();
        productExample.setOrderByClause("id desc");
        List<Product> products = productMapper.selectByExample(productExample);
        Long productId = products.get(0).getId();
        insertForList(productLadderDao, productParam.getProductLadderList(), productId);
        insertForList(productFullReductionDao, productParam.getProductFullReductionList(), productId);
        insertForList(productAttributeValueDao, productParam.getProductAttributeValueList(), productId);
        insertForList(skuStockDao, productParam.getSkuStockList(), productId);
        insertForList(memberPriceDao, productParam.getMemberPriceList(), productId);
        insertForList(subjectProductRelationDao, productParam.getSubjectProductRelationList(), productId);
        insertForList(preferenceAreaProductRelationDao, productParam.getPreferenceAreaProductRelationList(), productId);
        count = 1;
        return count;
    }

    public void insertForList(Object dao, List list, Long productId) {
        try {
            if (CollectionUtils.isEmpty(list)) return;
            for (Object item : list) {
                Method setId = item.getClass().getMethod("setId", Long.class);
                setId.invoke(item, (Long) null);
                Method setProductId = item.getClass().getMethod("setProductId", Long.class);
                setProductId.invoke(item, productId);
            }
            Method insertList = dao.getClass().getMethod("insertList", List.class);
            insertList.invoke(dao, list);
        } catch (Exception e) {
            LOGGER.warn("创建产品出错:{}", e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }
}
