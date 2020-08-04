package com.qf.test;

import com.qf.service.AccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAccountService {
    @Test
    public void test_transfer(){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService)applicationContext.getBean("accountService");
        accountService.transfer(2,1,100d);
    }
}
