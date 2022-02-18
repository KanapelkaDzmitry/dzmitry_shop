package com.example.dzmitry_shop.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class SubCategory extends BaseEntity{
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(unique = true)
    private String name;
    private boolean isActive;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "Category_id")
//    private Category category;
}
