package com.qf.test;

import com.qf.dao.UserDao;
import com.qf.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

    @Test
    public void testAddUser(){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-context.xml");
        UserService userSvice1 = (UserService)applicationContext.getBean("userSvice");
        UserService userSvice2 = (UserService)applicationContext.getBean("userSvice");
        System.out.println(userSvice1==userSvice2);
        applicationContext.close();
    }


}
