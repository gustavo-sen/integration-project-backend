package com.eletra.product.apirest.model;

import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractEntity {

        @Id
        private String name;
        public abstract String toString();

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }
}
