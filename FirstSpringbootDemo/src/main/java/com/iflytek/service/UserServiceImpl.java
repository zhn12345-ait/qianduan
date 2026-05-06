package com.iflytek.service;

import com.iflytek.dao.UserMapper;
import com.iflytek.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public void saveUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateById(user);
    }

    @Override
    public int deleteUser(Long id) {
        return userMapper.deleteById(id);
    }

}
