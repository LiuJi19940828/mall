//package com.liuji.mall.service.impl;
//
//import com.liuji.mall.dao.EsProductMapper;
//import com.liuji.mall.elasticsearch.document.EsProduct;
//import com.liuji.mall.elasticsearch.repository.EsProductRepository;
//import com.liuji.mall.service.EsProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//import java.util.Iterator;
//import java.util.List;
//
////@Service
//public class EsProductServiceImpl implements EsProductService {
////    @Autowired
//    private EsProductMapper esProductMapper;
////    @Autowired
//    private EsProductRepository esProductRepository;
//
//    @Override
//    public int importAll() {
//        List<EsProduct> esProducts = esProductMapper.selectEsProductInfoById(null);
//        Iterable<EsProduct> iterable = esProductRepository.saveAll(esProducts);
//        Iterator<EsProduct> iterator = iterable.iterator();
//        int count = 0;
//        while (iterator.hasNext()) {
//            count++;
//            iterator.next();
//        }
//        return count;
//    }
//
//    @Override
//    public void delete(Long id) {
//        esProductRepository.deleteById(id);
//    }
//
//    @Override
//    public EsProduct create(Long id) {
//        EsProduct esProduct = null;
//        List<EsProduct> esProducts = esProductMapper.selectEsProductInfoById(id);
//        if (esProducts.size() > 0) {
//            esProduct = esProducts.get(0);
//            esProductRepository.save(esProduct);
//        }
//        return esProduct;
//    }
//
//    @Override
//    public void deleteByIds(List<Long> ids) {
//        esProductRepository.deleteAllById(ids);
//    }
//
//    @Override
//    public Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize) {
//        Pageable pageable = PageRequest.of(pageNum, pageSize);
//        return esProductRepository.findByNameOrSubTitleOrKeywords(keyword, keyword, keyword, pageable);
//    }
//
//    @Override
//    public Page<EsProduct> searchByName(String keyword, Integer pageNum, Integer pageSize) {
//        Pageable pageable = PageRequest.of(pageNum, pageSize);
//        return esProductRepository.findByName(keyword, pageable);
//    }
//}
