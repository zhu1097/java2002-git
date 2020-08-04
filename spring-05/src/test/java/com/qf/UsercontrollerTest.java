package com.qf;

import com.qf.config.SpringConfig;
import com.qf.controller.UserController;
import com.qf.pojo.User;
import lombok.val;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UsercontrollerTest {
    @Autowired
    private  UserController userController ;
    @Test
    public void test_findAll(){
        List<User> userList = userController.findAll();
        System.out.println(userList);
    }
}
