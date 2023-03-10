package com.eletra.product.apirest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "categories_table")
@Getter
@Setter
@AllArgsConstructor
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
