package com.eps.springapp.repository;

import java.util.List;

import com.eps.springapp.domain.Product;

public interface ProductDao {

    public List<Product> getProductList();

    public void saveProduct(Product prod);

}