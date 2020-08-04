package com.qf.service.impl;

import com.qf.dao.TbSheetMapper;
import com.qf.pojo.TbSheet;
import com.qf.service.TbSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbSheetServiceImpl implements TbSheetService {
    @Autowired
    private TbSheetMapper tbSheetMapper;
    @Override
    public List<TbSheet> findAll() {
        return tbSheetMapper.selectByExample(null);
    }

    @Override
    public int insert(TbSheet tbSheet) {
        return tbSheetMapper.insert(tbSheet);
    }

}
