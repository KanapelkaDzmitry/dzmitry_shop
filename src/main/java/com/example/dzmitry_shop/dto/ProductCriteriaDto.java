package com.example.dzmitry_shop.dto;

import com.example.dzmitry_shop.entity.ProductStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProductCriteriaDto {
    private String name;
    private String subCategoryName;
    private Integer costMax;
    private Integer costMin;
    private Integer quantityMax;
    private Integer quantityMin;
    private String vendorCode;
    private String description;
    private ProductStatus status;
    private boolean joinSubCategory;

}
