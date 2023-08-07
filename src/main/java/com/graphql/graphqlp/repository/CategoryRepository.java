package com.graphql.graphqlp.repository;

import com.graphql.graphqlp.models.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CategoryRepository extends CrudRepository<CategoryEntity, UUID> {
}
