package com.example.dzmitry_shop.controller;

import com.example.dzmitry_shop.dto.CategoryDto;
import com.example.dzmitry_shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.example.dzmitry_shop.controller.CategoryController.ROOT_URL;

@RestController
@RequestMapping(ROOT_URL)
public class CategoryController {

    public final static String ROOT_URL = "category";
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<CategoryDto> findAllByFilter() {
        return categoryService.findAllByFilter();
    }

}
