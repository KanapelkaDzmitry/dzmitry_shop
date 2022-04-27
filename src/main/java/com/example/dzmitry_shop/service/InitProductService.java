package com.example.dzmitry_shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Profile("init-product")
public class InitProductService implements ApplicationRunner {

    private final ProductGeneratorService productGeneratorService;

    @Autowired
    public InitProductService(ProductGeneratorService productGeneratorService) {
        this.productGeneratorService = productGeneratorService;
    }

    @Transactional
    @Override
    public void run(ApplicationArguments args) throws Exception {
        productGeneratorService.generateProducts();
    }
}
