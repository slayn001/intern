package org.raspen.sqlitetest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.raspen.sqlitetest.model.Policy;
import org.raspen.sqlitetest.service.EntriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/policies")
public class EntryController {

    @Autowired
    private EntriesService policiesService;

    @GetMapping("/{id")
    public Policy get(@PathVariable("id")long id){
        return new Policy();
    }

    @RequestMapping(value="/list", method= RequestMethod.GET, produces="application/json")
    public String getPolicies() throws JsonProcessingException {
        List<Policy> policies = policiesService.findAllEntries();
        return new ObjectMapper().writeValueAsString(policies);
    }
}
