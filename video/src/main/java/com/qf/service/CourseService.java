package com.qf.service;

import com.qf.pojo.Course;
import com.qf.pojo.Video;

import java.util.List;

public interface CourseService {

    List<Course> selectCourseName();

    List<Course> findAll();

    void deleteById(String id);

    void updateCourse(Course course);

    void InsertCourse(Course course);

    Course selectCourseById(Integer courseId);
}
