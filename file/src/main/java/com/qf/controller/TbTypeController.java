package com.qf.controller;

import com.qf.pojo.TbType;
import com.qf.service.TbTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("type")
@RestController
public class TbTypeController {
    @Autowired
    private TbTypeService tbTypeService;
    @RequestMapping("selectType")
    private List<TbType> selectType(){
        return tbTypeService.selectType();
    }
}
