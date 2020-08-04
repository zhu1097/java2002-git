package com.qf.controller;

import com.qf.pojo.Subject;
import com.qf.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping("subject")
@RestController
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @RequestMapping("findAllSubject")
    public List<Subject> findAllSubject(){
        return subjectService.findAllSubject();
    }
    //前台查询全部
    @RequestMapping("selectAll")
    public ModelAndView selectAll(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        ServletContext servletContext = request.getSession().getServletContext();
        List<Subject> subjectList = subjectService.selectAll();
        servletContext.setAttribute("subjectList", subjectList);
        modelAndView.setViewName("/before/index");
        return modelAndView;
    }
}
