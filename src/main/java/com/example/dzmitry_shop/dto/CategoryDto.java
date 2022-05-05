package com.example.dzmitry_shop.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private String name;

    private List<SubCategoryDto> subCategory;

}
