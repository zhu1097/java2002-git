package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.Course;
import com.qf.pojo.Video;
import com.qf.service.CourseService;
import com.qf.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("video")
@RestController
public class VideoController {
    @Autowired
    private VideoService videoService;
    @Autowired
    private CourseService courseService;
   @RequestMapping("list")
   public Map findAll(Integer page,Integer limit) {
       System.out.println("11111111111111");
       PageHelper.startPage(page, limit);
       List<Video> videoList = videoService.findAll();
       PageInfo<Video> pageInfo = new PageInfo<>(videoList);
       HashMap<String, Object> map = new HashMap<>();
       map.put("code", 0);
       map.put("msg", "");
       map.put("count", pageInfo.getTotal());//总记录数
       map.put("data", pageInfo.getList());//分页数据
       return map;
   }
   @RequestMapping("updateVideo")
    public void updateVideo(Video video){
       videoService.updateVideo(video);
   }
   @RequestMapping("deleteById")
    public void deleteById(String vid){
       videoService.deleteById(vid);
   }

   @RequestMapping("insertVideo")
    public void insertVideo(Video video){
       videoService.insertVideo(video);
   }
   @RequestMapping("deleteByIds")
    public void deleteByIds(Integer [] ids){
       videoService.deleteByIds(ids);
   }
   @RequestMapping("showVideo")
    public ModelAndView showVideo(String videoId, String subjectName){
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.addObject("subjectName",subjectName);
       Video video = videoService.selectVideoByID(videoId);
       modelAndView.addObject("video",video);
       Course course = courseService.selectCourseById(video.getCourseId());
       modelAndView.addObject("course",course);
       modelAndView.setViewName("/before/section");
       return modelAndView;
   }
}
