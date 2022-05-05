package com.example.dzmitry_shop.dto;

import com.example.dzmitry_shop.entity.SubCategory;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
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
}
