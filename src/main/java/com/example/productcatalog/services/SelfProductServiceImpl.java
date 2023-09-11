package com.example.productcatalog.services;

import com.example.productcatalog.dtos.FakeStoreProductDto;
import com.example.productcatalog.dtos.GenericProductDto;
import com.example.productcatalog.models.Product;
import org.springframework.stereotype.Service;

@Service("SelfProductServiceImpl")
public class SelfProductServiceImpl implements ProductService{

    @Override
    public FakeStoreProductDto getProductById(Long id) {
        return null;
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto genericProductDto) {
        return null;
    }

}
