package com.example.dzmitry_shop.controller;

import com.example.dzmitry_shop.dto.ProductDto;
import com.example.dzmitry_shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class ProductController {

    public final static String ROOT_URL = "product";
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public List<ProductDto> findAllByProducts(){
        return productService.findAllByProducts();
    }

}
