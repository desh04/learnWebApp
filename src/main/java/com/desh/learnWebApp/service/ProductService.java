package com.desh.learnWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.desh.learnWebApp.model.Product;
import com.desh.learnWebApp.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    // List<Product> products = new ArrayList<>(Arrays.asList(
    // new Product(1, "iphone", 70000),
    // new Product(2, "camera", 40000)));

    public List<Product> getProduct() {
        // return products;
        return repo.findAll();
    }

    public Product getProductById(int prodId) {

        System.out.println(prodId);
        // return products.stream().filter(p -> p.getProdId() == prodId).findFirst()
        // .orElse(new Product(-1, "Not found", 0));
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        System.out.println(prod);
        // products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {

        // int idx = 0;
        // for (int i = 0; i < products.size(); i++) {
        // if (products.get(i).getProdId() == prod.getProdId()) {
        // idx = i;
        // }
        // }

        // products.set(idx, prod);

        repo.save(prod);
    }

    public void deleteProductById(int prodId) {

        // int idx = 0;
        // for (int i = 0; i < products.size(); i++) {
        // if (products.get(i).getProdId() == prodId) {
        // idx = i;
        // }
        // }

        // products.remove(idx);

        repo.deleteById(prodId);
    }

}
