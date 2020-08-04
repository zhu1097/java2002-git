package com.qf.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        if (e instanceof com.qf.exception.MyException){
            modelAndView.addObject("msg", e.getMessage());
        }else {
            modelAndView.addObject("msg", e.getMessage());
            modelAndView.setViewName("/err.jsp");
        }
        return modelAndView;
    }
}
