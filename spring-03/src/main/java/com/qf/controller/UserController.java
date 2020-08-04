package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    public void findAll(){
        List<User> users =userService.findAll();
        System.out.println(users);
    }
}
