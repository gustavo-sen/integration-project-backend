package com.eletra.product.apirest.model;

import javax.persistence.*;

@Entity
@Table(name = "models_table")
public class ModelEntity extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "id_model")
    private CategoryEntity categories;

    public ModelEntity() {
    }

    ModelEntity(CategoryEntity categories, String name) {
        super(name);
        this.categories = categories;
    }

    public CategoryEntity getCategories() {
        return categories;
    }
}
