package model;

import javax.persistence.*;

@Entity
@Table(name = "models_table")
public class ModelsEntity {

    @Id
    @Column(name = "model_name")
    private String modelName;
    @ManyToOne
    @JoinColumn(name = "id_category")
    private CategoriesEntity categories;

    public ModelsEntity() {}

    ModelsEntity(CategoriesEntity categories, String modelName) {
        this.categories = categories;
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return modelName;
    }

    public CategoriesEntity getCategories() {
        return categories;
    }
}
