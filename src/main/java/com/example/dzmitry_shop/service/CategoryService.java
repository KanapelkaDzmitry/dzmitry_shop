package com.example.dzmitry_shop.service;

import com.example.dzmitry_shop.converter.CategoryConverter;
import com.example.dzmitry_shop.dto.CategoryDto;
import com.example.dzmitry_shop.entity.Category;
import com.example.dzmitry_shop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryConverter categoryConverter;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository, CategoryConverter categoryConverter) {
        this.categoryRepository = categoryRepository;
        this.categoryConverter = categoryConverter;
    }

    public List<CategoryDto> findAllByFilter() {
        List<Category> categories = categoryRepository.findAll();
        return categoryConverter.convertList(categories);
    }


}
