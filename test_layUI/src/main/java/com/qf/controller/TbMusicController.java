package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.TbMusic;
import com.qf.service.TbMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("music")
public class TbMusicController {

    @Autowired
    private TbMusicService tbMusicService;

    @RequestMapping("findMusics")
    public Map findMusics(Integer page,Integer limit){

        PageHelper.startPage(page,limit);
        List<TbMusic> tbMusics = tbMusicService.findMusics();
        PageInfo<TbMusic> pageInfo = new PageInfo<>(tbMusics);


        HashMap<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());//总记录数
        map.put("data",pageInfo.getList());//分页数据
        return map;
    }

}
