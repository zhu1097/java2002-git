package com.qf.dao;

import com.qf.pojo.QueryVo;
import com.qf.pojo.Video;
import com.qf.utils.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoMapper {

    List<Video> findAll();

    void updateVideo(Video video);

    void deleteById(Integer vid);

    void insertVideo(Video video);

    void deleteByIds(Integer[] ids);

    Video selectVideoByID(String videoId);
}
