package com.example.dzmitry_shop.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

public class Category extends BaseEntity{

    @Column(unique = true)
    private String name;
    private Boolean isActive;


    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<SubCategory> subCategory;
}
