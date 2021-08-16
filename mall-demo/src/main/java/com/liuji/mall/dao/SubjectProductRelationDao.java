package com.liuji.mall.dao;

import com.liuji.mall.mbg.model.SubjectProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SubjectProductRelationDao {

    int insertList(@Param("list") List<SubjectProductRelation> subjectProductRelationList);
}
