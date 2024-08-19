package com.desh.learnWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.desh.learnWebApp.model.Product;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "iphone", 70000),
            new Product(2, "camera", 40000)));

    public List<Product> getProduct() {
        return products;
    }

    public Product getProductById(int prodId) {
        System.out.println("Check this ");
        System.out.println(prodId);
        return products.stream().filter(p -> p.getProdId() == prodId).findFirst()
                .orElse(new Product(-1, "Not found", 0));
    }

    public void addProduct(@RequestBody Product prod) {
        System.out.println(prod);
        products.add(prod);
    }
}
