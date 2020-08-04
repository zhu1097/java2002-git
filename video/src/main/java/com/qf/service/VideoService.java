package com.qf.service;

import com.qf.pojo.QueryVo;
import com.qf.pojo.Video;
import com.qf.utils.Page;

import java.util.List;

public interface VideoService {

    List<Video> findAll();

    void updateVideo(Video video);

    void deleteById(String vid);

    void insertVideo(Video video);

    void deleteByIds(Integer[] ids);

    Video selectVideoByID(String videoId);
}
