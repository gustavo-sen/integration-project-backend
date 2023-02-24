package com.eletra.product.apirest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lineup_table")
public class LineupEntity extends AbstractEntity {

    @Column(name = "name")
    private String name;

    public LineupEntity() {}

    LineupEntity(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


}
