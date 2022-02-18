package com.example.dzmitry_shop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity implements Serializable {

    @Id
    private Long id;
}
