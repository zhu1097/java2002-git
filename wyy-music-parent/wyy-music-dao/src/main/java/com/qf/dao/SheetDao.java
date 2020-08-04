package com.qf.dao;

import com.qf.pojo.Sheet;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SheetDao {
  public List<Sheet> findAll();
  public void insertSheet(Sheet sheet);
}
