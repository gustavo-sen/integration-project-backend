package com.eletra.product.apirest.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "categories_table")
@NoArgsConstructor
public class CategoryEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Short id;

    @ManyToOne
    @JoinColumn(name = "lineup_id", referencedColumnName = "id")
    private LineupEntity lineup;

    @Column(name = "name")
    private String name;

}
