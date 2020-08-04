package com.qf.dao;

import com.qf.pojo.Speaker;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpeakerMapper {
    public List<Speaker> selectSpeakerName();

    List<Speaker> findAll();

    void deleteById(int id);

    void updateSpeaker(Speaker speaker);

    void insertSpeaker(Speaker speaker);
}
