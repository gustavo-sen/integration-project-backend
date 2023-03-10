package com.eletra.product.apirest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "lineup_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LineupEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Short id;

    @Column(name = "name")
    private String name;

}
