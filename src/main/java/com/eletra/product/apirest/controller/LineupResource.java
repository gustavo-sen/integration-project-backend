package com.eletra.product.apirest.controller;

import com.eletra.product.apirest.model.CategoryEntity;
import com.eletra.product.apirest.model.LineupEntity;
import com.eletra.product.apirest.repository.ILineup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class LineupResource {

    @Autowired
    ILineup iLineup;

    @GetMapping("/lineups")
    public List<LineupEntity> lineupEntityList(){
        return  iLineup.findAll();
    }

    @GetMapping("/lineups/{name}")
    public LineupEntity lineupEntity(@PathVariable(value = "name") String name){
        return  iLineup.findByNameIgnoreCase(name);
    }

    @PostMapping("/lineups")
    public LineupEntity saveEntity(@RequestBody LineupEntity lineup){
        return iLineup.save(lineup);
    }

    @DeleteMapping("/lineups")
    public void deleteEntity(@RequestBody LineupEntity lineup){
        iLineup.delete(lineup);
    }


}
