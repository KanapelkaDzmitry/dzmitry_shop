package com.example.dzmitry_shop.service;

import com.example.dzmitry_shop.converter.ProductConverter;
import com.example.dzmitry_shop.dto.ProductDto;
import com.example.dzmitry_shop.entity.Product;
import com.example.dzmitry_shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService{

    private final ProductRepository productRepository;
    private final ProductConverter productConverter;

    @Autowired
    public ProductService(ProductRepository productRepository, ProductConverter productConverter) {
        this.productRepository = productRepository;
        this.productConverter = productConverter;
    }

    public List<ProductDto> findAllByProducts() {
        List<Product> products = productRepository.findAll();
        return productConverter.convertList(products);
    }
}
