package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.Speaker;
import com.qf.pojo.Video;
import com.qf.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("speaker")
public class SpeakerController {
    @Autowired
    private SpeakerService speakerService;

    @RequestMapping("selectSpeakerName")
    public List<Speaker> selectSpeakerName(){
        return speakerService.selectSpeakerName();
    }
    @RequestMapping("findAll")
    public Map findAll(int page,int limit){
        System.out.println("speaker");
        PageHelper.startPage(page, limit);
        List<Speaker> speakerList = speakerService.findAll();
        PageInfo<Speaker> pageInfo = new PageInfo<>(speakerList);
        HashMap<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());//总记录数
        map.put("data", pageInfo.getList());//分页数据
        return map;
    }
   @RequestMapping("deleteById")
    public void deleteById(String id){
        speakerService.deleteById(id);
   }
   @RequestMapping("updateSpeaker")
    public void updateSpeaker(Speaker speaker){
        speakerService.updateSpeaker(speaker);
   }
   @RequestMapping("insertSpeaker")
    public void insertSpeaker(Speaker speaker){
        speakerService.insertSpeaker(speaker);
   }
}
