package com.foam.dao;

import com.foam.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> queryUserByName(@Param("username") String name);
    User login(@Param("username")String name, @Param("password") String password);
}
