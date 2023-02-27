package com.eletra.product.apirest.repository;

import com.eletra.product.apirest.model.ModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IModel extends JpaRepository<ModelEntity,String> {
    ModelEntity findByNameIgnoreCase(String name);
}
