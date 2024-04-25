package com.example.productcatalogue.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.productcatalogue.model.Product;

@RestController
@RequestMapping("/products")
public class ProductController {

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
       
        return product;
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable String id) {
        
        return null;
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody Product product) {
       
        return product;
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id) {
       
    }

    @GetMapping
    public List<Product> searchProducts(@RequestParam(required = false) String name,
                                        @RequestParam(required = false) String category,
                                        @RequestParam(required = false) String attribute) {
       
        return null;
    }

 
}