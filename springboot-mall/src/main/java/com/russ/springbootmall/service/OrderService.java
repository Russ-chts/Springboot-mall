package com.russ.springbootmall.service;

import com.russ.springbootmall.dto.CreateOrderRequest;
import com.russ.springbootmall.dto.OrderQueryParams;
import com.russ.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId , CreateOrderRequest createOrderRequest);
}
