package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class MyController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public List<Product> getList() {
        return productService.getProducts();
    }

    @PostMapping("/product/add")
    public Product addList(@RequestBody Product product) {
        return productService.addProduct(product);
    }
}

