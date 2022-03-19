package com.example.dzmitry_shop.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SubCategory extends BaseEntity{

    @Column(unique = true)
    private String name;

    private boolean isActive;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "link_subcategory_characteristic",
            joinColumns = @JoinColumn(name = "subcategory_id"),
            inverseJoinColumns = @JoinColumn(name = "characteristic_id"),
            foreignKey = @ForeignKey(name = "fk_subcategory_to_characteristic")
    )
    private Set<Characteristic> characteristics;

    @OneToMany(mappedBy = "subCategory", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<Product> products;
}
