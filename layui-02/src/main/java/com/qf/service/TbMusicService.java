package com.qf.service;

import com.qf.pojo.TbMusic;

import java.util.List;

public interface TbMusicService {
    List<TbMusic> findMusics();

    void deleteById(String music_Id);

    void deleteByIds(Integer[] ids);

    void updateMusic(TbMusic tbMusic);

    void insertMusic(TbMusic tbMusic);
}
