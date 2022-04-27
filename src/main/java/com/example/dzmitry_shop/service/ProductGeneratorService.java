package com.example.dzmitry_shop.service;

import com.example.dzmitry_shop.entity.Product;
import com.example.dzmitry_shop.entity.SubCategory;
import com.example.dzmitry_shop.repository.ProductRepository;
import com.example.dzmitry_shop.repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

import static com.example.dzmitry_shop.Constants.*;

@Service
public class ProductGeneratorService {

    private final ProductRepository productRepository;
    private final SubCategoryRepository subCategoryRepository;

    @Autowired
    public ProductGeneratorService(ProductRepository productRepository, SubCategoryRepository subCategoryRepository) {
        this.productRepository = productRepository;
        this.subCategoryRepository = subCategoryRepository;
    }

    public void generateProducts() throws IOException {
        final Random random = new Random();
        final List<String> adjectives = readFile(PATH_TO_ADJECTIVE);
        final List<String> noun = readFile(PATH_TO_NOUN);
        final List<SubCategory> subCategories = subCategoryRepository.findAll();
        int sellerCode = 1;
        for (int i = 0; i < QUANTITY_PRODUCT; i++) {
            Product product = Product.builder()
                    .name(nameGenerate(random, adjectives, noun))
                    .description(descriptionGenerate(random, adjectives))
                    .sellerCode(sellerCode)
                    .cost(random.nextInt(MAX_COST) + MIN_COST)
                    .quantity(random.nextInt(MAX_QUANTITY))
                    .subCategory(subCategories.get(random.nextInt(QUANTITY_SUBCATEGORIES - 1)))
                    .build();
            sellerCode++;
            productRepository.save(product);
        }
    }


    private String nameGenerate(Random random, List<String> adjectives, List<String> noun) {
        return adjectives.get(random.nextInt(QUANTITY_LINES_IN_FILES))
                + SEPARATOR
                + adjectives.get(random.nextInt(QUANTITY_LINES_IN_FILES))
                + SEPARATOR
                + noun.get(random.nextInt(QUANTITY_LINES_IN_FILES));
    }


    private String descriptionGenerate(Random random, List<String> adjectives) {
        return adjectives.get(random.nextInt(QUANTITY_LINES_IN_FILES))
                + SEPARATOR
                + adjectives.get(random.nextInt(QUANTITY_LINES_IN_FILES));
    }

    private List<String> readFile(String path) throws IOException {
        return Files.readAllLines(Paths.get(path));
    }

}
