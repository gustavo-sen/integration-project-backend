package com.eletra.product.apirest.controller;

import com.eletra.product.apirest.model.CategoryEntity;
import com.eletra.product.apirest.repository.ICategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class CategoryResource {

    @Autowired
    ICategory iCategory;

    @GetMapping("/categories")
    public List<CategoryEntity> categoryEntityList(){
        return  iCategory.findAll();
    }

    @GetMapping("/categories/{name}")
    public CategoryEntity categoryEntity(@PathVariable(value = "name") String name){
        return  iCategory.findByNameIgnoreCase(name);
    }

}
