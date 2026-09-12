package com.example.demo; 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Spring Boot! My web server is working.";
    }
}