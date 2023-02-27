package com.eletra.product.apirest.model;

import javax.persistence.*;

@Entity
@Table(name = "category_table")
public class CategoryEntity extends AbstractEntity {


    @ManyToOne
    @JoinColumn(name = "lineup_id")
    private LineupEntity lineup;

    CategoryEntity(){}
    CategoryEntity(LineupEntity lineup, String name) {
        super(name);
        this.lineup = lineup;
    }

    public LineupEntity getLineup() {
        return lineup;
    }

    public void setLineup(LineupEntity lineup) {
        this.lineup = lineup;
    }
}
