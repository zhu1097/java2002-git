package com.qf.dao;

import com.qf.pojo.Music;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicDao {
    List<Music> findAll();
    Music findById(String musicId);
    List<Music> search(String keyword);
    Music prevSong(String musicId);
    Music nextSong(String musicId);
}
