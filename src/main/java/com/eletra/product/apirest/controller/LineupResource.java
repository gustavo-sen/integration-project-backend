package com.eletra.product.apirest.controller;

import com.eletra.product.apirest.model.LineupEntity;
import com.eletra.product.apirest.repository.ILineup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class LineupResource {

    @Autowired
    ILineup iLineup;

    @GetMapping("/lineup")
    public List<LineupEntity> lineupEntityList(){
        return  iLineup.findAll();
    }


}
