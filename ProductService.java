package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService implements ServiceImpl {

    @Autowired
    private ProductRepository repository;

    public ProductService() {
    }

    @Override
    public List<Product> getProducts(Product product) {
        return repository.findAll();
    }

    @Override
    public Product addProduct(Product product) {
        repository.save(product);
        return product;
    }

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
}




	



	

	
