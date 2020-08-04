package com.qf.service;

import com.qf.pojo.TbSheet;

import java.util.List;

public interface TbSheetService {
    List<TbSheet> findAll();

    int insert(TbSheet tbSheet);
}
