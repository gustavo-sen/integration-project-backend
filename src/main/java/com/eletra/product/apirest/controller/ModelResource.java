package com.eletra.product.apirest.controller;


import com.eletra.product.apirest.model.LineupEntity;
import com.eletra.product.apirest.model.ModelEntity;
import com.eletra.product.apirest.repository.IModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Model")
@CrossOrigin(origins = "*") // deixa que todos os domínios podem acessar, poderia ser mais estrita como https://dominio...
public class ModelResource {

    @Autowired
    IModel iModel;


    //Get list of models
    @ApiOperation(value = "Retorna uma lista de entidades")
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

    @PutMapping("/models")
    public void updateEntity(@RequestBody ModelEntity models){
        iModel.save(models);
    }



}
