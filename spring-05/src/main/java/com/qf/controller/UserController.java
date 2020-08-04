package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import java.util.List;
@Controller
public class UserController {
    @Autowired
    private UserService userservice;
    public List<User> findAll(){
        return userservice.findAll();
    }


}
