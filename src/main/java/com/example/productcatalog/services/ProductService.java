package com.example.productcatalog.services;

import com.example.productcatalog.dtos.FakeStoreProductDto;
import com.example.productcatalog.dtos.GenericProductDto;
import com.example.productcatalog.exceptions.NotFoundException;
import com.example.productcatalog.models.Product;

import java.util.List;

public interface ProductService {

    // Names of controller and service functions will be same
    GenericProductDto getProductById(Long id) throws NotFoundException;
    GenericProductDto createProduct(GenericProductDto genericProductDto);

    GenericProductDto updateProduct(GenericProductDto genericProductDto, Long id);

    GenericProductDto deleteProduct(Long id);

    List<GenericProductDto> getAllProducts();

}
