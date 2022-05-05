package com.example.dzmitry_shop.converter;

import com.example.dzmitry_shop.dto.ProductDto;
import com.example.dzmitry_shop.entity.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductConverter implements Converter<Product, ProductDto>{
    @Override
    public ProductDto convert(Product product) {
        return ProductDto.builder()
                .name(product.getName())
                .build();
    }

    @Override
    public List<ProductDto> convertList(List<Product> products) {
        return products.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }
}
