package com.qf.service.impl;



import com.qf.dao.VideoMapper;
import com.qf.pojo.QueryVo;
import com.qf.pojo.Video;
import com.qf.service.VideoService;
import com.qf.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> findAll() {
        return videoMapper.findAll();
    }

    @Override
    public void updateVideo(Video video) {
         videoMapper.updateVideo(video);
    }

    @Override
    public void deleteById(String vid) {
        videoMapper.deleteById(Integer.parseInt(vid));
    }

    @Override
    public void insertVideo(Video video) {
        videoMapper.insertVideo(video);
    }

    @Override
    public void deleteByIds(Integer[] ids) {
        videoMapper.deleteByIds(ids);
    }

    @Override
    public Video selectVideoByID(String videoId) {
        return videoMapper.selectVideoByID(videoId);
    }
}
