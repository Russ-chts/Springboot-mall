package com.russ.springbootmall.dao;

import com.russ.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
