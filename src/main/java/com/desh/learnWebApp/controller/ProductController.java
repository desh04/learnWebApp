package com.desh.learnWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desh.learnWebApp.model.Product;
import com.desh.learnWebApp.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProduct() {
        return service.getProduct();
    }

    @RequestMapping("/products/{prodId}")
    public Product geProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(Product prod) {
        System.out.println(prod);
        service.addProduct(prod);
    }
}
