package com.eletra.product.apirest.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "lineup_table")
public class LineupEntity extends AbstractEntity {

    public LineupEntity() {}

    LineupEntity(String name){
       super(name);
    }

}
