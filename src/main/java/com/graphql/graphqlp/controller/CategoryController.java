package com.graphql.graphqlp.controller;

import com.graphql.graphqlp.models.CategoryEntity;
import com.graphql.graphqlp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Optional;
import java.util.UUID;

@Controller
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @MutationMapping()
    CategoryEntity addCategory(@Argument CategoryInput category) {
        var categoryCreated = this.categoryRepository.save(new CategoryEntity(category.name));
        return categoryCreated;
    }

    @QueryMapping()
    Optional<CategoryEntity> categoryById(@Argument UUID id) {
        var category = this.categoryRepository.findById(id);
        return category;
    }

    record CategoryInput(String name) {
    }
}
