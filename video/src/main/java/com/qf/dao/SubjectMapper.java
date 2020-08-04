package com.qf.dao;

import com.qf.pojo.Subject;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectMapper {
    List<Subject> findAllSubject();
     //前台查询全部
    List<Subject> selectAll();

    Subject selectSubjectById(Integer subjectId);

}
