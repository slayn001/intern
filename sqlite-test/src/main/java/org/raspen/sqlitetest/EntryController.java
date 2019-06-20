package org.raspen.sqlitetest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.raspen.sqlitetest.model.Policy;
import org.raspen.sqlitetest.model.EtlReport;
import org.raspen.sqlitetest.service.EntriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @RequestMapping("/state/{state}")
    public List<Policy> getPolicyByState(@PathVariable String state) {
        state = state.toUpperCase();
        return policiesService.findByState(state);
    }

    @RequestMapping("/error/{yesHuh}")
    public List<Policy> filterLoadedWithError(@PathVariable String yesHuh) {
        yesHuh = yesHuh.toUpperCase();
        return policiesService.filterLoadedWithError(yesHuh);
    }

    @RequestMapping("/companies/{company}")
    public List<Policy> getWritingCompany(@PathVariable String company) {
        return policiesService.filterWritingCompany(company);
    }

    @RequestMapping("/businesses/{business}")
    public List<Policy> getLineOfBusiness(@PathVariable String business) {
        return policiesService.filterLineOfBusiness(business);
    }

    @RequestMapping("/reports/errorreport")
    public List<EtlReport> getEtlReportReport() {
        return policiesService.filterEtlReport();
    }

}
