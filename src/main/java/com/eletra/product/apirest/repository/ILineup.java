package com.eletra.product.apirest.repository;

import com.eletra.product.apirest.model.LineupEntity;
import com.eletra.product.apirest.model.ModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILineup extends JpaRepository<LineupEntity,String> {
    List<LineupEntity> findAll();
    LineupEntity findByNameIgnoreCase(String name);
    LineupEntity save(LineupEntity lineupEntity);
}
