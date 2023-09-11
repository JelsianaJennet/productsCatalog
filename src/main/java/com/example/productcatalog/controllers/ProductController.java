package com.example.productcatalog.controllers;

import com.example.productcatalog.dtos.FakeStoreProductDto;
import com.example.productcatalog.dtos.GenericProductDto;
import com.example.productcatalog.models.Product;
import com.example.productcatalog.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    // Constructor Injection
    public ProductController(@Qualifier("fakeStoreProductService") ProductService productService) {
        this.productService = productService;
    }
    // setter injection and field injection by Autowired is not recommended

    @GetMapping
    public void getAllProducts(){

    }

    //localhost:8080/products/123
    @GetMapping("/{id}")
    public FakeStoreProductDto getProductsById(@PathVariable("id") Long id) {
//        return "Product id: " + id;
        return productService.getProductById(id);

    }

    @DeleteMapping("/{id}")
    public void deleteProductById(Long id) {

    }

    @PostMapping
    public GenericProductDto createProduct(@RequestBody GenericProductDto genericProductDto) {
//        return "New product created "+ UUID.randomUUID();
        return productService.createProduct(genericProductDto);
    }

    @PutMapping("/{id}")
    public void updateProductById(Long id) {

    }
}
