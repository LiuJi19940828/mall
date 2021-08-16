package com.liuji.mall.service.impl;

import com.liuji.mall.mbg.mapper.PreferenceAreaMapper;
import com.liuji.mall.mbg.model.PreferenceArea;
import com.liuji.mall.mbg.model.PreferenceAreaExample;
import com.liuji.mall.service.PreferenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreferenceAreaServiceImpl implements PreferenceAreaService {
    @Autowired
    private PreferenceAreaMapper mapper;

    @Override
    public List<PreferenceArea> getAll() {
        return mapper.selectByExample(new PreferenceAreaExample());
    }
}
