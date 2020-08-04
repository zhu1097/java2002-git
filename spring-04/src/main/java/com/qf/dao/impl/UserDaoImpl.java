package com.qf.dao.impl;

import com.qf.dao.UserDao;
import com.qf.pojo.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate;
    public List<User> findAll() {
        return jdbcTemplate.query("select * from user", new BeanPropertyRowMapper<User>(User.class));
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate=jdbcTemplate;
    }
}
