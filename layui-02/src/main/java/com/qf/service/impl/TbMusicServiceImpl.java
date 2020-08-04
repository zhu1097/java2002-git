package com.qf.service.impl;

import com.qf.dao.TbMusicMapper;
import com.qf.pojo.TbMusic;
import com.qf.service.TbMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbMusicServiceImpl implements TbMusicService {
    @Autowired
    private TbMusicMapper tbMusicMapper;
    public List<TbMusic> findMusics() {
        return tbMusicMapper.findMusics();
    }

    @Override
    public void deleteById(String music_Id) {
        tbMusicMapper.deleteByPrimaryKey(music_Id);
    }

    @Override
    public void deleteByIds(Integer[] ids) {
        tbMusicMapper.deleteByIds(ids);
    }

    @Override
    public void updateMusic(TbMusic tbMusic) {
        tbMusicMapper.updateByPrimaryKeySelective(tbMusic);
    }

    @Override
    public void insertMusic(TbMusic tbMusic) {
        tbMusicMapper.insert(tbMusic);
    }
}
