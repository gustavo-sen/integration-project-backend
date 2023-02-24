package com.eletra.product.api.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduct extends JpaRepository<IEntity,Long> {

}
