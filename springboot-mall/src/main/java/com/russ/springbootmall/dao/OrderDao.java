package com.russ.springbootmall.dao;

import com.russ.springbootmall.dto.OrderQueryParams;
import com.russ.springbootmall.model.Order;
import com.russ.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId ,Integer totalAmount);

    void createOrderItems(Integer orderId , List<OrderItem> orderItemList);
}
