package com.eletra.product.apirest.repository;

import com.eletra.product.apirest.model.CategoryEntity;
import com.eletra.product.apirest.model.ModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IModel extends JpaRepository<ModelEntity,String> {
    ModelEntity findByNameIgnoreCase(String name);
    List<ModelEntity> findByCategoryNameIgnoreCase(String categoryName);
}
