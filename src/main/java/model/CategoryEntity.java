package model;

import javax.persistence.*;

@Entity
@Table(name = "categories_table")
public class CategoryEntity {

    @Id
    @Column(name = "category_name")
    private String category_name;

    @ManyToOne
    @JoinColumn(name = "id_lineup")
    private LineupEntity lineup;

    CategoryEntity(){}
    CategoryEntity(LineupEntity lineup, String name) {
        this.lineup = lineup;
        this.category_name = name;
    }

    @Override
    public String toString() {
        return category_name;
    }

    public LineupEntity getLineup() {
        return lineup;
    }
}
