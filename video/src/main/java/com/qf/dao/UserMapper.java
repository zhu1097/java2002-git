package com.qf.dao;

import com.qf.pojo.Admin;
import com.qf.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectAdminByUsernameAndPassword(User user);

    User selectUserByEmail(String email);

    void updateUser(User user1);

    boolean insertUser(User user);
}
