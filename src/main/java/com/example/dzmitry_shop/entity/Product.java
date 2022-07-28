package com.example.dzmitry_shop.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product extends BaseEntity {

    @Column(unique = true)
    private String name;

    @Column(unique = true)
    private int sellerCode;

    private int cost;
    private int quantity;
    private String description;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "subCategory_id")
    private SubCategory subCategory;

    @Enumerated(EnumType.STRING)
    private ProductStatus status = ProductStatus.MODERATION;
}
