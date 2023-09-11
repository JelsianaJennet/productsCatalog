package com.example.productcatalog.services;

import com.example.productcatalog.dtos.FakeStoreProductDto;
import com.example.productcatalog.dtos.GenericProductDto;
import com.example.productcatalog.models.Product;

public interface ProductService {

    // Names of controller and service functions will be same
    FakeStoreProductDto getProductById(Long id);
    GenericProductDto createProduct(GenericProductDto genericProductDto);
}
