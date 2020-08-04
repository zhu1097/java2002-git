package com.qf;

import com.qf.controller.UserController;
import com.qf.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TemplateTest {
    @Test
    public void  test_findAll(){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController usercontroller = (UserController)applicationContext.getBean("usercontroller");
        List<User> users = usercontroller.findAll();
        System.out.println(users);
    }
}
