package com.example.dzmitry_shop.dto;

import lombok.*;

import java.util.List;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SubCategoryDto {
    private String name;

    private List<CharacteristicDto> characteristics;
}
