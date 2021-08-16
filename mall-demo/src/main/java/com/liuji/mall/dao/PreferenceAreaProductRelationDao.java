package com.liuji.mall.dao;

import com.liuji.mall.mbg.model.PreferenceAreaProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PreferenceAreaProductRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PreferenceAreaProductRelation> preferenceAreaProductRelationList);
}
