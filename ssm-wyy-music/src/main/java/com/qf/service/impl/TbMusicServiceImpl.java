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
    public List<TbMusic> findAll() {
        return tbMusicMapper.selectByExample(null);
    }

    public TbMusic findById(String musicId) {
        return tbMusicMapper.selectByPrimaryKey(musicId);
    }

    @Override
    public List<TbMusic> search(String keyword) {
        TbMusicExample tbMusicExample =new TbMusicExample();
        TbMusicExample.Criteria criteria = tbMusicExample.createCriteria();
        criteria.andMusicNameLike("%"+keyword+"%");
        return tbMusicMapper.selectByExample(tbMusicExample);
    }

    @Override
    public TbMusic prevSong(String musicId) {
        List<TbMusic> tbMusics = tbMusicMapper.selectByExample(null);
        int index=0;
        for (int i=0;i<tbMusics.size();i++){
            if (musicId.equals(tbMusics.get(i).getMusicId())){
                index=i;
            }
        }
        index=index==0?tbMusics.size()-1:index-1;
        return tbMusics.get(index);
    }

    @Override
    public TbMusic nextSong(String musicId) {
        List<TbMusic> tbMusics = tbMusicMapper.selectByExample(null);
        int index=0;
        for (int i=0;i<tbMusics.size();i++){
            if (musicId.equals(tbMusics.get(i).getMusicId())){
                index=i;
            }

        }
        index=index==tbMusics.size()-1?0:index+1;
        return tbMusics.get(index);
    }

}
