package com.eletra.product.apirest.controller;

import com.eletra.product.apirest.model.CategoryEntity;
import com.eletra.product.apirest.repository.ICategory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*") // deixa que todos os domínios podem acessar, poderia ser mais estrita como https://dominio...
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Category")
public class CategoryResource {

    @Autowired
    private ICategory iCategory;

    @ApiOperation(value = "Retorna uma lista de entidades")
    @GetMapping("/categories")
    public List<CategoryEntity> categoryEntityList(){
        return  iCategory.findAll();
    }

    @ApiOperation(value = "Return an specific entity by name")
    @GetMapping("/categories/{name}")
    public CategoryEntity categoryEntity(@PathVariable(value = "name") String name){
        return  iCategory.findByNameIgnoreCase(name);
    }

    @PostMapping("/categories")
    public CategoryEntity saveEntity(@RequestBody CategoryEntity category){
        return iCategory.save(category);
    }

    @DeleteMapping("/categories")
    public void deleteEntity(@RequestBody CategoryEntity category){
        iCategory.delete(category);
    }

    @PutMapping("/categories")
    public CategoryEntity updateEntity(@RequestBody CategoryEntity category){
        return iCategory.save(category);
    }
}
