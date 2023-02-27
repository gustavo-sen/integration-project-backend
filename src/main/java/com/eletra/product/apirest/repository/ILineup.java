package com.eletra.product.apirest.repository;

import com.eletra.product.apirest.model.LineupEntity;
import com.eletra.product.apirest.model.ModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILineup extends JpaRepository<LineupEntity,String> {
    LineupEntity findByNameIgnoreCase(String name);
}
