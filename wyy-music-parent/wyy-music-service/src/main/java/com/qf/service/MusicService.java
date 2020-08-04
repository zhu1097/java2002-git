package com.qf.service;

import com.qf.pojo.Music;

import java.util.List;

public interface MusicService {
    List<Music> findAll();
    Music findById(String musicId);
    List<Music> search(String keyword);
    Music prevSong(String musicId);
    Music nextSong(String musicId);
}
