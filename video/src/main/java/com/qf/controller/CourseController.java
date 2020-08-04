package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.Course;
import com.qf.pojo.Speaker;
import com.qf.pojo.Subject;
import com.qf.service.CourseService;
import com.qf.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @Autowired
    private SubjectService subjectService;
    @RequestMapping("selectCourseName")
    public List<Course> selectCourseName(){
        return courseService.selectCourseName();
    }
    @RequestMapping("findAll")
    public Map findAll(int page,int limit){
        PageHelper.startPage(page, limit);
        List<Course> coursesList = courseService.findAll();
        PageInfo<Course> pageInfo = new PageInfo<>(coursesList);
        HashMap<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());//总记录数
        map.put("data", pageInfo.getList());//分页数据
        return map;
    }
    @RequestMapping("deleteById")
    public void deleteById(String id){
        courseService.deleteById(id);
    }
    @RequestMapping("updateCourse")
    public void updateCourse(Course course ){
        System.out.println("updateCourse");
        courseService.updateCourse(course);
    }
    @RequestMapping("InsertCourse")
    public void InsertCourse(Course course){
        courseService.InsertCourse(course);
    }

//    前台
@RequestMapping("course/{subjectId}")
public ModelAndView course(@PathVariable String subjectId) {
    ModelAndView modelAndView = new ModelAndView();
    Subject subject = subjectService.selectSubjectById(subjectId);
    modelAndView.addObject("subject",subject);
    modelAndView.setViewName("/before/course");
    return modelAndView;

}
}
