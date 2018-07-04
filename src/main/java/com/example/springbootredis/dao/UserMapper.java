package com.example.springbootredis.dao;

import com.example.springbootredis.model.UserModel;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    UserModel getUser(@Param("id") Long id);
}
