package com.qf.controller;

import com.qf.pojo.TbMusic;
import com.qf.service.TbMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("music")
public class TbMusicController {

    @Autowired
    private TbMusicService tbMusicService;

    @RequestMapping("findAll")
    public List<TbMusic> findAll(){
        return tbMusicService.findAll();
    }
    @RequestMapping("findById")
    public TbMusic findById(String musicId){
        return tbMusicService.findById(musicId);
    }
    @RequestMapping("search")
    public List<TbMusic> search(String keyword){
        return tbMusicService.search(keyword);
    }
    @RequestMapping("prevSong")
    public TbMusic prevSong(String musicId){
        return tbMusicService.prevSong(musicId);
    }
    @RequestMapping("nextSong")
    public TbMusic nextSong(String musicId){
      return tbMusicService.nextSong(musicId);
    }
}
