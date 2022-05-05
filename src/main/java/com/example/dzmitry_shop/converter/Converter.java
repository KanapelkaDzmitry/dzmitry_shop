package com.example.dzmitry_shop.converter;

import java.util.List;

public interface Converter<Model,Dto>{
    Dto convert(Model model);

    List<Dto> convertList(List<Model> models);
}
