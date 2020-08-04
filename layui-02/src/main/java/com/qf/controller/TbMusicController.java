package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.TbMusic;
import com.qf.pojo.TbSheet;
import com.qf.service.TbMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("music")
public class TbMusicController {
    @Autowired
    private TbMusicService tbMusicService;
    @RequestMapping("findMusics")
    public Map findMusics(int page,int limit){
        List<TbMusic> musicList = tbMusicService.findMusics();
        PageHelper.startPage(page,limit);
        PageInfo<TbMusic> pageInfo = new PageInfo<>(musicList);
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());//总记录数
        map.put("data",pageInfo.getList());//分页数据
        return map;
    }
    @RequestMapping("deleteById")
    public void deleteById(String music_id){
        System.out.println(music_id);
        tbMusicService.deleteById(music_id);
    }
    @RequestMapping("deleteByIds")
    public void deleteByIds(Integer [] ids){
        System.out.println(Arrays.toString(ids));
        tbMusicService.deleteByIds(ids);
    }
    @RequestMapping("updateMusic")
    public void updateMusic(TbMusic tbMusic){
        tbMusicService.updateMusic(tbMusic);
    }
    @RequestMapping("insertMusic")
    public void insertMusic(TbMusic tbMusic){
        System.out.println(tbMusic.toString());
        tbMusicService.insertMusic(tbMusic);
    }
}
