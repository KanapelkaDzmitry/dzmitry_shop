package com.example.dzmitry_shop.specification;

import com.example.dzmitry_shop.dto.ProductCriteriaDto;
import com.example.dzmitry_shop.dto.ProductDto;
import com.example.dzmitry_shop.entity.Product;
import com.example.dzmitry_shop.entity.ProductStatus;
import com.example.dzmitry_shop.entity.SubCategory;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

public class ProductSpecification {

    public static Specification<Product> buildListFilter(ProductCriteriaDto productCriteria) {
        return ((root, query, cb) -> {
            if (productCriteria == null) {
                return null;
            }

            List<Predicate> predicates = new ArrayList<>();

            if (StringUtils.isNotBlank(productCriteria.getSubCategoryName())) {
                Join<Product, SubCategory> productToSubCategory =
                        root.join("subCategory", JoinType.INNER);
                predicates.add(cb.equal(productToSubCategory.get("name"), productCriteria.getSubCategoryName()));
            }

            if (productCriteria.getCostMin() != null) {
                predicates.add(cb.greaterThanOrEqualTo(root.get("cost"), productCriteria.getCostMin()));
            }

            if (productCriteria.getCostMax() != null) {
                predicates.add(cb.lessThanOrEqualTo(root.get("cost"), productCriteria.getCostMax()));
            }

            if (productCriteria.getQuantityMin() != null) {
                predicates.add(cb.greaterThanOrEqualTo(root.get("quantity"), productCriteria.getQuantityMin()));
            }

            if (productCriteria.getQuantityMax() != null) {
                predicates.add(cb.lessThanOrEqualTo(root.get("quantity"), productCriteria.getQuantityMax()));
            }

            if (StringUtils.isNotBlank(productCriteria.getVendorCode())) {
                predicates.add(cb.equal(root.get("sellerCode"), productCriteria.getVendorCode()));
            }

            if (StringUtils.isNotBlank(productCriteria.getDescription())) {
                predicates.add(cb.equal(root.get("description"), productCriteria.getDescription()));
            }

            if (StringUtils.isNotBlank(productCriteria.getName())) {
                predicates.add(cb.equal(root.get("name"), productCriteria.getName()));
            }
            predicates.add(cb.equal(root.get("status"), ProductStatus.AVAILABLE));

            return cb.and(predicates.toArray(new Predicate[0]));
        });
    }
}