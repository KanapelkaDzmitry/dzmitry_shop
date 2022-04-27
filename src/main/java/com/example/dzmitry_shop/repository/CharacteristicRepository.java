package com.example.dzmitry_shop.repository;

import com.example.dzmitry_shop.entity.Characteristic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacteristicRepository extends JpaRepository<Characteristic, Long> {
}
