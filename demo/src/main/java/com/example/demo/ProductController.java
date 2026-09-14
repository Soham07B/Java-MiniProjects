package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    // Your temporary "database"
    private List<Product> inventory = new ArrayList<>();

    // Constructor adds some default data so it isn't empty
    public ProductController() {
        inventory.add(new Product("Laptop", 999.99, 5));
        inventory.add(new Product("Headphones", 149.50, 12));
    }

    // GET /products -> List products
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return inventory; // Spring Boot automatically converts this to JSON!
    }
}
