package com.qf.controller;

import com.qf.pojo.TbMusic;
import com.qf.pojo.TbSheet;
import com.qf.service.TbSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sheet")
public class TbSheetController {
    @Autowired
    private TbSheetService tbSheetService;
    @RequestMapping("findAll")
    public List<TbSheet> findAll(){
        return tbSheetService.findAll();
    }
    @RequestMapping("insertSheet")
    public int insertSheet(TbSheet tbSheet){
        return tbSheetService.insert(tbSheet);
    }
}
