package com.example.dzmitry_shop.converter;

import com.example.dzmitry_shop.dto.CharacteristicDto;
import com.example.dzmitry_shop.entity.Characteristic;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CharacteristicConverter implements Converter<Characteristic, CharacteristicDto>{
    @Override
    public CharacteristicDto convert(Characteristic characteristic) {
        return CharacteristicDto.builder()
                .name(characteristic.getName())
                .build();
    }

    @Override
    public List<CharacteristicDto> convertList(List<Characteristic> characteristics) {
        return characteristics.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }
}
