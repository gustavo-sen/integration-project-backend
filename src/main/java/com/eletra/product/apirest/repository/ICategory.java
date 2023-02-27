package com.eletra.product.apirest.repository;

import com.eletra.product.apirest.model.CategoryEntity;
import com.eletra.product.apirest.model.ModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategory extends JpaRepository<CategoryEntity,String> {
    CategoryEntity findByNameIgnoreCase(String name);
}

