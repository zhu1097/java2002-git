package com.qf.dao.impl;

import com.qf.dao.UserDao;
import com.qf.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    public List<User> findAll(){
        List<User> userList =new ArrayList<User>();
        userList.add(new User(1,"jack"));
        userList.add(new User(2,"rose"));
        userList.add(new User(3,"张三"));
        return userList;
    }
}
