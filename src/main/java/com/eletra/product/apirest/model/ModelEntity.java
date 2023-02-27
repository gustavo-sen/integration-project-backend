package com.eletra.product.apirest.model;

import javax.persistence.*;

@Entity
@Table(name = "model_table")
public class ModelEntity extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    public ModelEntity() {}

    ModelEntity(CategoryEntity category, String name) {
        super(name);
        this.category = category;
    }

    public CategoryEntity getCategories() {
        return category;
    }

    public void setCategories(CategoryEntity category) {
        this.category = category;
    }
}
