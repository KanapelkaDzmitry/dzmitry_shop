package com.example.dzmitry_shop.repository;

import com.example.dzmitry_shop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
