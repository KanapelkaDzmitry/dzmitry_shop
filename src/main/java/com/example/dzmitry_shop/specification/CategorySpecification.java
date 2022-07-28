package com.example.dzmitry_shop.specification;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

public class CategorySpecification {

    public static Specification<Category> buildListFilter(CategoryCriteriaDto categoryCriteria) {
        return ((root, query, cb) -> {
            if (categoryCriteria == null) {
                return null;
            }

            List<Predicate> predicates = new ArrayList<>();

            if (StringUtils.isNotBlank(categoryCriteria.getSubCategoryName())) {
                Join<ProductCategory, SubProductCategory> categoryToSubCategory =
                        root.join("subProductCategories", JoinType.INNER);
                predicates.add(cb.equal(categoryToSubCategory.get("name"), categoryCriteria.getSubCategoryName()));
            }

            if (StringUtils.isNotBlank(categoryCriteria.getName())) {
                predicates.add(cb.equal(root.get("name"), categoryCriteria.getName()));
            }

            predicates.add(cb.equal(root.get("isActive"),true));
            return cb.and(predicates.toArray(new Predicate[0]));
        });
    }


    public static Specification<ProductCategory> fetchSubcategories() {
        return BaseSpecification.withFetch("subProductCategories");
    }
}

