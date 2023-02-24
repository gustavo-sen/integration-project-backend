package com.eletra.product.apirest.model;

import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractEntity {


        @Id
        @Column(name = "name")
        private String name;

        public AbstractEntity(String name) {
                this.name = name;
        }
        public AbstractEntity(){}

        public String toString(){
                return name;
        };


        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }


}
