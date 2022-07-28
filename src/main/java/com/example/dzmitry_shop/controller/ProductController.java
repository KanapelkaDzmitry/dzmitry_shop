package com.example.dzmitry_shop.controller;

import com.example.dzmitry_shop.dto.ProductCriteriaDto;
import com.example.dzmitry_shop.dto.ProductDto;
import com.example.dzmitry_shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.dzmitry_shop.controller.ProductController.ROOT_URL;

@RestController
@RequestMapping(ROOT_URL)
public class ProductController {

    public final static String ROOT_URL = "/product";
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public Page<ProductDto> findAllByProducts(ProductCriteriaDto dto, @PageableDefault Pageable pageable){
        return productService.findAll(dto, pageable);
    }

}
