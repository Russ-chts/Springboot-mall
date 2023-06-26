package com.russ.springbootmall.dao;

import com.russ.springbootmall.dto.UserRegisterRequest;
import com.russ.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
