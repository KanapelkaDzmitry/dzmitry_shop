package com.example.dzmitry_shop.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Characteristic extends BaseEntity{

//    TODO: Характеристики ни с чем не смаплены, надо их привязать

    @Column(unique = true)
    private String name;

}
