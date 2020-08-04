package com.qf;

import com.qf.dao.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {
    @Test
    public void test_userDao() {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.add();
    }
}
