package com.iflytek.service;

import com.iflytek.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {
    void saveUser(User user);
    User getUserById(Long id);

    int updateUser(User user);

    int deleteUser(Long id);

}
