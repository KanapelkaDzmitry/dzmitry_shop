package com.example.dzmitry_shop.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/subcategories")
@RequiredArgsConstructor
public class SubCategoryController {

    private final SubCategoryService subCategoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<SubCategoryDto> listSubCategories(
            @PageableDefault(size = Constants.DEFAULT_PAGE_SIZE) Pageable pageable,
            SubCategoryCriteriaDto subCategoryCriteria) {
        return subCategoryService.listSubCategories(subCategoryCriteria, pageable);
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public SubCategoryDto oneSubCategory(@PathVariable Long id) {
        return subCategoryService.findSubCategoryById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public SubProductCategory saveSubCategory(@RequestBody SubCategoryDto subCategoryDto) {
        return subCategoryService.saveSubCategory(subCategoryDto);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void removeSubCategory(@PathVariable Long id) {
        subCategoryService.removeSubCategory(id);
    }

}

}
