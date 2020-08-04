package com.qf;

import com.qf.controller.UserController;
import com.qf.pojo.Car;
import com.qf.pojo.Customer;
import com.qf.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserController {
    @Test
    public void test_user(){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }
    @Test
    public void test_findall(){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = (UserController) applicationContext.getBean("userController");
       // System.out.println(userController);
        userController.findAll();
    }
    @Test
    public void test_customer(){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer customer = (Customer) applicationContext.getBean("customer");
       // System.out.println(userController);
        System.out.println(customer);
    }
}
