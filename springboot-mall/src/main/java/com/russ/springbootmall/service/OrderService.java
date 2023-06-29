package com.russ.springbootmall.service;

import com.russ.springbootmall.dto.CreateOrderRequest;
import com.russ.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId , CreateOrderRequest createOrderRequest);
}
