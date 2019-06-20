package org.raspen.sqlitetest.service;

import org.raspen.sqlitetest.Utils.State;
import org.raspen.sqlitetest.dao.configuration.PolicyRepository;
import org.raspen.sqlitetest.model.Policy;
import org.raspen.sqlitetest.model.EtlReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntriesService {
    @Autowired
    private PolicyRepository policyRepository;

    public List<Policy> findAllEntries() { return policyRepository.findAllEntries(); }

    public List<Policy> findByState(String s) { return policyRepository.findByState(s);}

    public List<Policy> filterLoadedWithError(String yesHuh) { return policyRepository.filterLoadedWithError(yesHuh);}

    public List<Policy> filterWritingCompany(String a) {return policyRepository.filterWritingCompany(a);}

    public List<Policy> filterLineOfBusiness(String a) {return policyRepository.filterLineOfBusiness(a);}

    public List<EtlReport> filterEtlReport() {
        List<EtlReport> etlReports = new ArrayList<>();
        for (State s: State.getAll()) {
            List<Policy> policies = policyRepository.findByState(s.getCode().toUpperCase());
            List<Policy> extracted = policies.stream()
                    .filter(row -> row.getTransformationError().equals("Y"))
                    .collect(Collectors.toList());


            EtlReport etlReport = new EtlReport();
            etlReport.setState(s.getCode().toString());
            etlReport.setTransformationErrorNumber(extracted.size());
            etlReports.add(etlReport);

        }

        return etlReports;

    }

}
