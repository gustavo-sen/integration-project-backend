package com.eletra.product.apirest.model;

import javax.persistence.*;

@Entity
@Table(name = "models_table")
public class ModelEntity extends AbstractEntity{

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_model")
    private CategoryEntity categories;

    public ModelEntity() {}

    ModelEntity(CategoryEntity categories, String name) {
        this.categories = categories;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public CategoryEntity getCategories() {
        return categories;
    }
}
