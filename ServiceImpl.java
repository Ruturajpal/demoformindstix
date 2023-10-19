package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ServiceImpl {

	 List<Product> getProducts();

	    // Add a product
	    Product addProduct(Product product);

		List<Product> getProducts(Product product);
	
	
}
