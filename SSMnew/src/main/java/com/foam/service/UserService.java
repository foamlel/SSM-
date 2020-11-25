package com.foam.service;

import com.foam.entity.User;

import java.util.List;

public interface UserService {
    User login(String name, String password);
    List<User> queryUserByName(String name);
}
