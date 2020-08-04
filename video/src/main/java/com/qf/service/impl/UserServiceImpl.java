package com.qf.service.impl;

import com.qf.dao.UserMapper;
import com.qf.pojo.Admin;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectAdminByUsernameAndPassword(User user) {
        return userMapper.selectAdminByUsernameAndPassword(user);
    }

    @Override
    public User selectUserByEmail(String email) {
        return userMapper.selectUserByEmail(email);
    }

    @Override
    public void updateUser(User user1) {
        userMapper.updateUser(user1);
    }

    @Override
    public boolean insertUser(User user) {
        return userMapper.insertUser(user);
    }
}
