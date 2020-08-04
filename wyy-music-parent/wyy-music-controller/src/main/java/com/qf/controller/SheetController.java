package com.qf.controller;

import com.qf.pojo.Sheet;
import com.qf.service.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sheet")
public class SheetController {
    @Autowired
    private SheetService sheetService;
    @RequestMapping("findAll")
    public List<Sheet> findAll(){
        return sheetService.findAll();
    }
    @RequestMapping("insertSheet")
    public void insertSheet(Sheet sheet){
       sheetService.insertSheet(sheet);
    }
}
