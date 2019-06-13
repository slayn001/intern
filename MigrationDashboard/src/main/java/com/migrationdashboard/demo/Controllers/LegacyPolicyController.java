package com.migrationdashboard.demo.Controllers;
import com.migrationdashboard.demo.Models.LegacyPolicy;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v1/legacypolicy")

public class LegacyPolicyController {
    @GetMapping
    public List<LegacyPolicy> list(){
        List<LegacyPolicy> legacypolicy= new ArrayList<>();
        return legacypolicy;
    }


    @GetMapping("/{id")
    public LegacyPolicy get(@PathVariable("id")long id){
        return new LegacyPolicy();
    }
}
