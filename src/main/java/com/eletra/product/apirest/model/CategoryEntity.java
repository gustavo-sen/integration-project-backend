package com.eletra.product.apirest.model;

import javax.persistence.*;

@Entity
@Table(name = "category_table")
public class CategoryEntity extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_lineup")
    private LineupEntity lineup;

    CategoryEntity(){}
    CategoryEntity(LineupEntity lineup, String name) {
        this.lineup = lineup;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public LineupEntity getLineup() {
        return lineup;
    }

}
