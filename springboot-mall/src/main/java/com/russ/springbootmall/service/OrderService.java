package com.russ.springbootmall.service;

import com.russ.springbootmall.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder(Integer userId , CreateOrderRequest createOrderRequest);
}
