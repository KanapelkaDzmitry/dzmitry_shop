package com.example.dzmitry_shop.repository;

import com.example.dzmitry_shop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {


}
