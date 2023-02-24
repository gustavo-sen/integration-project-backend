package com.eletra;

import com.eletra.product.apirest.model.CategoryEntity;
import com.eletra.product.apirest.repository.ICategory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
        teste();
    }

    private static void teste(){

    }
}
