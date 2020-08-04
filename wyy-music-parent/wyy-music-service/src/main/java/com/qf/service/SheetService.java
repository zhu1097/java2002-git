package com.qf.service;

import com.qf.pojo.Sheet;

import java.util.List;

public interface SheetService {
    List<Sheet> findAll();
   void insertSheet (Sheet sheet);
}
