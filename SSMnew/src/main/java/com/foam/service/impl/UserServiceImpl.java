package com.foam.service.impl;

import com.foam.dao.UserMapper;
import com.foam.entity.User;
import com.foam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String name, String password) {
        List<User> user = userMapper.queryUserByName(name);
        return user!=null? userMapper.login(name, password):null;
    }

    @Override
    public List<User> queryUserByName(String name) {
        return userMapper.queryUserByName(name);
    }
}
