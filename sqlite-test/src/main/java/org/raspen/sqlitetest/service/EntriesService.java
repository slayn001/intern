package org.raspen.sqlitetest.service;

import org.raspen.sqlitetest.dao.configuration.PolicyRepository;
import org.raspen.sqlitetest.model.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntriesService {
    @Autowired
    private PolicyRepository policyRepository;

    public List<Policy> findAllEntries() { return policyRepository.findAllEntries(); }
    public List<Policy> findByState(String s) { return policyRepository.findByState(s);}
    public List<Policy> filterLoadedWithError(String yesHuh) { return policyRepository.filterLoadedWithError(yesHuh);}
    public List<Policy> filterWritingCompany(String a) {return policyRepository.filterWritingCompany(a);}
    public List<Policy> filterLineOfBusiness(String a) {return policyRepository.filterLineOfBusiness(a);}


}
