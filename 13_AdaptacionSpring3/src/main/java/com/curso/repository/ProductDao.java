package com.curso.repository;

import java.util.List;

import com.curso.domain.Product;


public interface ProductDao {

    public List<Product> getProductList();

    public void saveProduct(Product prod);

}