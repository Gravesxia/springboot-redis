package com.example.springbootredis.service.impl;

import com.example.springbootredis.dao.UserMapper;
import com.example.springbootredis.model.UserModel;
import com.example.springbootredis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public UserModel getUser(Long id) {
        return userMapper.getUser(id);
    }
}
