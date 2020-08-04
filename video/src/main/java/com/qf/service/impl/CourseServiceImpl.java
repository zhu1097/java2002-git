package com.qf.service.impl;

import com.qf.dao.CourseMapper;
import com.qf.pojo.Course;
import com.qf.pojo.Video;
import com.qf.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> selectCourseName() {
        return courseMapper.selectCourseName();
    }

    @Override
    public List<Course> findAll() {
       return courseMapper.findAll();
    }

    @Override
    public void deleteById(String id) {
        courseMapper.deleteById(Integer.parseInt(id));
    }

    @Override
    public void updateCourse(Course course) {
        courseMapper.updateCourse(course);
    }

    @Override
    public void InsertCourse(Course course) {
        courseMapper.InsertCourse(course);
    }

    @Override
    public Course selectCourseById(Integer courseId) {
        return courseMapper.selectCourseById(courseId);
    }
}