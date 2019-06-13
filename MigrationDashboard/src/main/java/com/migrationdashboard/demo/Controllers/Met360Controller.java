package com.migrationdashboard.demo.Controllers;


import com.migrationdashboard.demo.Models.MetLife360Policy;
import com.migrationdashboard.demo.Repository.Met360Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/api/v1/met360policy")

public class Met360Controller {
    @Autowired
    private Met360Repository met360Repository;

    @GetMapping
    public List<MetLife360Policy> list(){

        return met360Repository.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody MetLife360Policy metlife360){
        met360Repository.save(metlife360);
    }
    @GetMapping("/{mId")
    public MetLife360Policy get(@PathVariable("mId")long mId)
    {
        return  met360Repository.getOne(mId);
    }
}
