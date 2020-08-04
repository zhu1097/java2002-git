package com.qf.service;

import com.qf.pojo.TbMusic;

import java.util.List;

public interface TbMusicService {
    List<TbMusic> findAll();

    TbMusic findById(String musicId);


    List<TbMusic> search(String keyword);

    TbMusic prevSong(String musicId);

    TbMusic nextSong(String musicId);
}
