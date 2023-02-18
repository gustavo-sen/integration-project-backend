package model;

import javax.persistence.*;

@Entity
@Table(name = "models_table")
public class ModelEntity implements IEntity{

    @Id
    @Column(name = "model_name")
    private String modelName;
    @ManyToOne
    @JoinColumn(name = "id_category")
    private CategoryEntity categories;

    public ModelEntity() {}

    ModelEntity(CategoryEntity categories, String modelName) {
        this.categories = categories;
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return modelName;
    }

    public CategoryEntity getCategories() {
        return categories;
    }
}
