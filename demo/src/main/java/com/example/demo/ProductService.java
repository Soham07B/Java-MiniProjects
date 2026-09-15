package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private List<Product> inventory = new ArrayList<>();

    public ProductService() {
        inventory.add(new Product("Laptop", 999.99, 5));
        inventory.add(new Product("Headphones", 149.50, 12));
    }

    public List<Product> getAllProducts() {
        return inventory;
    }
} 