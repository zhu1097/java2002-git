package com.qf.service.impl;

import com.qf.pojo.User;
import com.qf.service.UserService;
import com.qf.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public List<User> findAll() {
        return userDao.findAll();
    }


}
