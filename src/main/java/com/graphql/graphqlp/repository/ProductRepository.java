package com.graphql.graphqlp.repository;

import com.graphql.graphqlp.models.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProductRepository extends CrudRepository<ProductEntity, UUID> {

}
