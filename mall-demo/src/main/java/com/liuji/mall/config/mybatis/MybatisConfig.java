package com.liuji.mall.config.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan({"com.liuji.mall.dao", "com.liuji.mall.mbg.mapper"})
public class MybatisConfig {
}
