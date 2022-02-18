package com.example.dzmitry_shop.entity;

import javax.persistence.Column;

public class Characteristic extends BaseEntity{
    @Column(unique = true)
    private String name;

}
