package com.russ.springbootmall.service.impl;

import com.russ.springbootmall.dao.UserDao;
import com.russ.springbootmall.dto.UserRegisterRequest;
import com.russ.springbootmall.model.User;
import com.russ.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
