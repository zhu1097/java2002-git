package com.qf.controller;

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
    @RequestMapping("selectSheet")
    public List<TbSheet> selectSheet(){
        return tbSheetService.selectSheet();
    }
}
