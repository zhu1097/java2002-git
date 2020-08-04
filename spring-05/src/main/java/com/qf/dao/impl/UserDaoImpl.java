package com.qf.dao.impl;

import com.qf.dao.UserDao;
import com.qf.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<User> findAll() {
        return jdbcTemplate.query("select * from user", new BeanPropertyRowMapper<User>(User.class));
    }


}
