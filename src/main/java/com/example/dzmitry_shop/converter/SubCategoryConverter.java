package com.example.dzmitry_shop.converter;

import com.example.dzmitry_shop.dto.SubCategoryDto;
import com.example.dzmitry_shop.entity.SubCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SubCategoryConverter implements Converter<SubCategory, SubCategoryDto> {

    private final CharacteristicConverter characteristicConverter;

    @Autowired
    public SubCategoryConverter(CharacteristicConverter characteristicConverter) {
        this.characteristicConverter = characteristicConverter;
    }

    @Override
    public SubCategoryDto convert(SubCategory subCategory) {
        return SubCategoryDto.builder()
                .name(subCategory.getName())
                .characteristics(characteristicConverter.convertList(subCategory.getCharacteristics()))
                .build();
    }


    @Override
    public List<SubCategoryDto> convertList(List<SubCategory> subCategories) {
        return subCategories.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }
}
