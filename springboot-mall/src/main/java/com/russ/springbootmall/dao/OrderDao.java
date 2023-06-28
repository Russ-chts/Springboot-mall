package com.russ.springbootmall.dao;

import com.russ.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer createOrder(Integer userId ,Integer totalAmount);

    void createOrderItems(Integer orderId , List<OrderItem> orderItemList);
}
