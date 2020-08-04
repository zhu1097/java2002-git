package com.qf.service.impl;

import com.qf.dao.TbMusicMapper;
import com.qf.pojo.TbMusic;
import com.qf.pojo.TbMusicExample;
import com.qf.service.TbMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbMusicServiceImpl implements TbMusicService {

    @Autowired
    private TbMusicMapper tbMusicMapper;



    @Override
    public List<TbMusic> findMusics() {
        return tbMusicMapper.findMusics();
    }
}
