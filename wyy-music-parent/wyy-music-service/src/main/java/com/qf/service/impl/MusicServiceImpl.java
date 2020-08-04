package com.qf.service.impl;

import com.qf.dao.MusicDao;
import com.qf.pojo.Music;
import com.qf.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl  implements MusicService {
    @Autowired
    private MusicDao musicDao;
    public List<Music> findAll() {
        return musicDao.findAll();
    }

    public Music findById(String musicId) {
        return musicDao.findById(musicId);
    }

    public List<Music> search(String keyword) {
        return musicDao.search(keyword);
    }

    public Music prevSong(String musicId) {
        int index= 0;
        List<Music> musicList = musicDao.findAll();
        for (int i=0;i<musicList.size();i++){
            if (musicId.equals(musicList.get(i).getMusicId())){
                index=i;
            }
        }
        index =index==0?musicList.size()-1:index-1;
        return musicList.get(index);
    }

    public Music nextSong(String musicId) {
        int index= 0;
        List<Music> musicList = musicDao.findAll();
        for (int i=0;i<musicList.size();i++){
            if (musicId.equals(musicList.get(i).getMusicId())){
                index=i;
            }
        }
        index =index==musicList.size()-1?0:index+1;
        return musicList.get(index);
    }


}
