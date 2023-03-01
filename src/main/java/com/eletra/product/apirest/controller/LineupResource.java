package com.eletra.product.apirest.controller;

import com.eletra.product.apirest.model.LineupEntity;
import com.eletra.product.apirest.repository.ILineup;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Lineup")
@CrossOrigin(origins = "*") // deixa que todos os domínios podem acessar, poderia ser mais estrita como https://dominio...
public class LineupResource {

    @Autowired
    ILineup iLineup;

    @ApiOperation(value = "Return an list of Lineup")
    @GetMapping("/lineups")
    public List<LineupEntity> getLineups(){
        return iLineup.findAll();
    }

    @ApiOperation(value = "Return an list of Lineup")
    @GetMapping("/lineups/{name}")
    public LineupEntity findByNameIgnoreCase(@PathVariable(value = "name") String name){
        return iLineup.findByNameIgnoreCase(name);
    }
}
