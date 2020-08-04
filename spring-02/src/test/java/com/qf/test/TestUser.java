package com.qf.test;

import com.qf.pojo.CollectionDemo;
import com.qf.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testUser(){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-context.xml");
        User user =(User) applicationContext.getBean("user");
        System.out.println(user);

    }
    @Test
    public void testCollectionDemo(){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-context.xml");
        CollectionDemo collectionDemo =(CollectionDemo) applicationContext.getBean("collectiondemo");
        System.out.println(collectionDemo);

    }
}
