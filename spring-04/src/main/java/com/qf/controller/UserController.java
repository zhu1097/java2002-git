package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;


import java.util.List;

public class UserController {
    private UserService userservice;
    public List<User> findAll(){
        return userservice.findAll();
    }

    public void setUserservice(UserService userservice) {
        this.userservice = userservice;
    }
}
