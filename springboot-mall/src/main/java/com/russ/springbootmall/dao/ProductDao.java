package com.russ.springbootmall.dao;

import com.russ.springbootmall.dto.ProductRequest;
import com.russ.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
