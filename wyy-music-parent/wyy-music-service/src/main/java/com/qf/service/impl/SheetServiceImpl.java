package com.qf.service.impl;

import com.qf.dao.SheetDao;
import com.qf.pojo.Sheet;
import com.qf.service.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SheetServiceImpl implements SheetService {
    @Autowired
    private SheetDao sheetDao;
    public List<Sheet> findAll() {
        return sheetDao.findAll();
    }

    public void insertSheet(Sheet sheet) {
        sheetDao.insertSheet(sheet);
    }
}
