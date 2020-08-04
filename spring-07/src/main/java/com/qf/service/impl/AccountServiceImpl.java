package com.qf.service.impl;

import com.qf.dao.AccountDao;
import com.qf.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;


public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }


    public void transfer(Integer from, Integer to, Double money) {

        accountDao.decreaseMoney(from,money);//转出
        int i = 1/0;
        accountDao.increaseMoney(to,money);//转入
    }
}
