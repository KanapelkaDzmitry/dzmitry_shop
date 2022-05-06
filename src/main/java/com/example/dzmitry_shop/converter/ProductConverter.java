package com.example.dzmitry_shop.converter;

import com.example.dzmitry_shop.dto.ProductDto;
import com.example.dzmitry_shop.dto.SubCategoryDto;
import com.example.dzmitry_shop.entity.Product;
import com.example.dzmitry_shop.entity.SubCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductConverter implements Converter<Product, ProductDto> {

    private final SubCategoryConverter subCategoryConverter;

    @Autowired
    public ProductConverter(SubCategoryConverter subCategoryConverter) {
        this.subCategoryConverter = subCategoryConverter;
    }

    @Override
    public ProductDto convert(Product product) {
        return ProductDto.builder()
                .name(product.getName())
                .cost(product.getCost())
                .description(product.getDescription())
                .quantity(product.getQuantity())
                .sellerCode(product.getSellerCode())
                .subCategoryDto(subCategoryConverter.convert(product.getSubCategory()))
                .build();
    }

    @Override
    public List<ProductDto> convertList(List<Product> products) {
        return products.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }


    public Page<ProductDto> convertPage(Page<Product> products) {
        List<Product> productList = products.getContent();
        List<ProductDto> productDtoList = convertList(productList);
        return new PageImpl<>(productDtoList, products.getPageable(), productList.size());
    }
}
