package com.qf.controller;

import com.qf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("login")
    public ModelAndView login(){
        System.out.println("第一次登录");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userInfo","张艺兴");
        modelAndView.setViewName("/userInfo.jsp");
        return modelAndView;

    }
    @RequestMapping("test_ById")
    public ModelAndView test_ById(String id){
        System.out.println(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userInfo","张艺兴");
        modelAndView.setViewName("/userInfo.jsp");
        return modelAndView;

    }
    @RequestMapping("test_param")
    public ModelAndView test_param(@RequestParam("id") String uid){
        System.out.println(uid);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userInfo","张艺兴");
        modelAndView.setViewName("/userInfo.jsp");
        return modelAndView;

    }
    @RequestMapping("test_form")
    public ModelAndView test_form(User user){
        System.out.println(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userInfo","张艺兴");
        modelAndView.setViewName("/userInfo.jsp");
        return modelAndView;

    }
    @RequestMapping("test_collection")
    public ModelAndView test_collection(User user){
        System.out.println(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userInfo","张艺兴");
        modelAndView.setViewName("/userInfo.jsp");
        return modelAndView;

    }
    @RequestMapping("test_date")
    public ModelAndView test_date(User user){
        System.out.println(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userInfo","张艺兴");
        modelAndView.setViewName("/userInfo.jsp");
        return modelAndView;
    }
    @RequestMapping("test_PathVariable/{id}")
    public ModelAndView test_PathVariable(@PathVariable("id") String id){
        System.out.println(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userInfo","张艺兴");
        modelAndView.setViewName("/userInfo.jsp");
        return modelAndView;
    }
    @RequestMapping("test_CookieValue")
    public ModelAndView test_CookieValue(@CookieValue("JSESSIONID") String cookieValue){
        System.out.println(cookieValue);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userInfo","张艺兴");
        modelAndView.setViewName("/userInfo.jsp");
        return modelAndView;
    }
    @RequestMapping("test_RequestHeader")
    public ModelAndView test_RequestHeader(@RequestHeader("Accept") String header){
        System.out.println(header);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userInfo","张艺兴");
        modelAndView.setViewName("/userInfo.jsp");
        return modelAndView;
    }
    @RequestMapping("test_RequestBody")
    public ModelAndView test_RequestBody(@RequestBody String content){
        System.out.println(content);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userInfo","张艺兴");
        modelAndView.setViewName("/userInfo.jsp");
        return modelAndView;
    }
    @RequestMapping("test_ResponseBody")
    @ResponseBody
    public String test_ResponseBody(){
        System.out.println("test_ResponseBody");
        return "/userInfo.jsp";
    }
}
