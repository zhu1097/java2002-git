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
    public List<TbSheet> selectSheet() {
        return tbSheetMapper.selectByExample(null);
    }
}
