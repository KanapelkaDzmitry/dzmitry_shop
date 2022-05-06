package com.example.dzmitry_shop.service;

import com.example.dzmitry_shop.converter.ProductConverter;
import com.example.dzmitry_shop.dto.ProductDto;
import com.example.dzmitry_shop.entity.Product;
import com.example.dzmitry_shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService{

    private final ProductRepository productRepository;
    private final ProductConverter productConverter;

    @Autowired
    public ProductService(ProductRepository productRepository, ProductConverter productConverter) {
        this.productRepository = productRepository;
        this.productConverter = productConverter;
    }

    public Page<ProductDto> findAll(Pageable pageable) {
        Page<Product> products = productRepository.findAll(pageable);
        return productConverter.convertPage(products);
    }
}
