package com.liuji.mall.service.impl;

import com.liuji.mall.mbg.mapper.SubjectMapper;
import com.liuji.mall.mbg.model.Subject;
import com.liuji.mall.mbg.model.SubjectExample;
import com.liuji.mall.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectMapper mapper;

    @Override
    public List<Subject> getAll() {
        return mapper.selectByExample(new SubjectExample());
    }
}
