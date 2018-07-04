package com.example.springbootredis.service;

import com.example.springbootredis.model.UserModel;

public interface IUserService {
    UserModel getUser(Long id);
}
