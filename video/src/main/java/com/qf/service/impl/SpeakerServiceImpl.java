package com.qf.service.impl;

import com.qf.dao.SpeakerMapper;
import com.qf.pojo.Speaker;
import com.qf.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeakerServiceImpl implements SpeakerService {
    @Autowired
     private SpeakerMapper speakerMapper;
    @Override
    public List<Speaker> selectSpeakerName() {
        System.out.println(speakerMapper.selectSpeakerName());
        return speakerMapper.selectSpeakerName();
    }

    @Override
    public List<Speaker> findAll() {
        return speakerMapper.findAll();
    }

    @Override
    public void deleteById(String id) {
        speakerMapper.deleteById(Integer.parseInt(id));
    }

    @Override
    public void updateSpeaker(Speaker speaker) {
        speakerMapper.updateSpeaker(speaker);
    }

    @Override
    public void insertSpeaker(Speaker speaker) {
        speakerMapper.insertSpeaker(speaker);
    }
}
