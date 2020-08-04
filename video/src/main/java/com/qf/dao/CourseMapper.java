package com.qf.dao;

import com.qf.pojo.Course;
import com.qf.pojo.Video;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseMapper {

    List<Course> selectCourseName();

    List<Course> findAll();

    void deleteById(Integer id);

    void updateCourse(Course course);

    void InsertCourse(Course course);

    Course selectCourseById(Integer courseId);
}
