package com.eletra.product.apirest.controller;


import com.eletra.product.apirest.model.ModelEntity;
import com.eletra.product.apirest.repository.IModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ModelResource {

    @Autowired
    IModel iModel;

    @GetMapping("/models")
    public List<ModelEntity> modelEntityList(){ return  iModel.findAll(); }

    @GetMapping("/models/{name}")
    public ModelEntity modelEntity(@PathVariable(value = "name") String name){
        return  iModel.findByNameIgnoreCase(name);
    }




}
