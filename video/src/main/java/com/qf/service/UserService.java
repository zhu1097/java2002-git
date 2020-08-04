package com.qf.service;

import com.qf.pojo.Admin;
import com.qf.pojo.User;

public interface UserService {
    User selectAdminByUsernameAndPassword(User user);

    User selectUserByEmail(String email);

    void updateUser(User user1);

    boolean insertUser(User user);
}
