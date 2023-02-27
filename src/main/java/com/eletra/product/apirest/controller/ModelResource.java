package com.eletra.product.apirest.controller;


import com.eletra.product.apirest.model.LineupEntity;
import com.eletra.product.apirest.model.ModelEntity;
import com.eletra.product.apirest.repository.IModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ModelResource {

    @Autowired
    IModel iModel;

    //Get list of models
    @GetMapping("/models")
    public List<ModelEntity> modelEntityList(){ return  iModel.findAll(); }

    //get a model by name
    @GetMapping("/models/{name}")
    public ModelEntity modelEntity(@PathVariable(value = "name") String name){
        return  iModel.findByNameIgnoreCase(name);
    }

    //Post Method
    @PostMapping("/models")
    public ModelEntity saveEntity(@RequestBody ModelEntity models){
        return iModel.save(models);
    }

    @DeleteMapping("/models")
    public void deleteEntity(@RequestBody ModelEntity models){
        iModel.delete(models);
    }



}
