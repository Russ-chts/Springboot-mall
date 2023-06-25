package com.russ.springbootmall.service;

import com.russ.springbootmall.dto.UserRegisterRequest;
import com.russ.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

}
