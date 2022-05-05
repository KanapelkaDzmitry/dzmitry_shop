package com.example.dzmitry_shop.converter;

import com.example.dzmitry_shop.converter.Converter;
import com.example.dzmitry_shop.converter.SubCategoryConverter;
import com.example.dzmitry_shop.dto.CategoryDto;
import com.example.dzmitry_shop.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryConverter implements Converter<Category, CategoryDto> {

    private final SubCategoryConverter subCategoryConverter;

    @Autowired
    public CategoryConverter(SubCategoryConverter subCategoryConverter) {
        this.subCategoryConverter = subCategoryConverter;
    }

    @Override
    public CategoryDto convert(Category category) {
        return CategoryDto.builder()
                .name(category.getName())
                .subCategory(subCategoryConverter.convertList(category.getSubCategory()))
                .build();
    }

    @Override
    public List<CategoryDto> convertList(List<Category> categories) {
        return categories.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }
}
