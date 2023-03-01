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

    @ApiOperation(value = "Return an specific entity by name")
    @GetMapping("/models/{name}")
    public ModelEntity modelEntity(@PathVariable(value = "name") String name){
        return  iModel.findByNameIgnoreCase(name);
    }

    @ApiOperation(value = "Return an specific entity by name")
    @GetMapping("/models/{categoryName}")
    public List<ModelEntity> modelEntityByCategory(@PathVariable(value = "categoryName") String categoryName){
        return  iModel.findByCategoryNameIgnoreCase(categoryName);
    }

}
