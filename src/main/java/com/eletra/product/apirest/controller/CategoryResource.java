package com.eletra.product.apirest.controller;

import com.eletra.product.apirest.model.CategoryEntity;
import com.eletra.product.apirest.model.LineupEntity;
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

    @ApiOperation(value = "Return an list of Categories of an specific Lineup")
    @GetMapping("/categories/{categoryName}")
    public List<CategoryEntity> findCategoryEntityByLineupNameIgnoreCase(@PathVariable(value = "categoryName") String categoryName){
        return  iCategory.findCategoryEntityByLineupNameIgnoreCase(categoryName);
    }

    @ApiOperation(value = "Save a new category")
    @PutMapping("/categories")
    public CategoryEntity saveCategory(@RequestBody CategoryEntity categoryEntity){
        return iCategory.save(categoryEntity);
    }

    @ApiOperation(value = "Save a new category")
    @DeleteMapping("/categories")
    public void deleteCategory(@RequestBody CategoryEntity categoryEntity){
        iCategory.delete(categoryEntity);
    }

}
