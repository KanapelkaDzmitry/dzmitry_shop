package com.example.dzmitry_shop.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private String name;
    private int sellerCode;
    private int cost;
    private int quantity;
    private String description;
    private SubCategoryDto subCategoryDto;
}
