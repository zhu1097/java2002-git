package com.qf.service.impl;

import com.qf.service.UserService;

public class UserServiceImpl implements UserService {

    public void init(){
        System.out.println("init");
    }
    public void destroy(){
        System.out.println("destroy");
    }

    public void addUser() {
        System.out.println("addUser");
    }

}
