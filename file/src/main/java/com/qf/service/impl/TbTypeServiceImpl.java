package com.qf.service.impl;

import com.qf.dao.TbTypeMapper;
import com.qf.pojo.TbType;
import com.qf.service.TbTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbTypeServiceImpl implements TbTypeService {
    @Autowired
    private TbTypeMapper tbTypeMapper;
    @Override
    public List<TbType> selectType() {
        return tbTypeMapper.selectByExample(null);
    }
}
