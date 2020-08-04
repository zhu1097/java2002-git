package com.qf.service;

import com.qf.pojo.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> findAllSubject();

    List<Subject> selectAll();

    Subject selectSubjectById(String subjectId);
}
