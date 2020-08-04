package com.qf.service.impl;

import com.qf.pojo.User;
import com.qf.service.UserService;
import com.qf.dao.UserDao;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public List<User> findAll() {
        return userDao.findAll();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
