package com.qf.service;

import com.qf.pojo.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> selectSpeakerName();

    List<Speaker> findAll();

    void deleteById(String id);

    void updateSpeaker(Speaker speaker);

    void insertSpeaker(Speaker speaker);
}
