//package com.liuji.mall.elasticsearch.repository;
//
//import com.liuji.mall.elasticsearch.document.EsProduct;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
//
//public interface EsProductRepository extends ElasticsearchRepository<EsProduct, Long> {
//    //    Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable page);
//    Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable pageable);
//
//    Page<EsProduct> findByName(String name, Pageable pageable);
//}
//
