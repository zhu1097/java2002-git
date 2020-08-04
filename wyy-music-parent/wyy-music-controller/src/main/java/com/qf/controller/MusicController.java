package com.qf.controller;
import com.qf.pojo.Music;
import com.qf.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("music")
public class MusicController {
    @Autowired
    private MusicService musicService;
    @RequestMapping("findAll")
    public List<Music> findAll(){
        return musicService.findAll();
    }
    @RequestMapping("findById")
    public Music findById(String musicId){
        Music music = musicService.findById(musicId);
        System.out.println(music);
        return music;
    }
    @RequestMapping("search")
    public List<Music> search(String keyword){
        return musicService.search(keyword);
    }
    @RequestMapping("prevSong")
    public Music prevSong(String musicId){
        return musicService.prevSong(musicId);
    }
    @RequestMapping("nextSong")
    public Music nextSong(String musicId){
        return musicService.nextSong(musicId);
    }
}
