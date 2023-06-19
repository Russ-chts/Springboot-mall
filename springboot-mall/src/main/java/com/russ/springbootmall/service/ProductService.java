package com.russ.springbootmall.service;

import com.russ.springbootmall.dto.ProductRequest;
import com.russ.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

}
