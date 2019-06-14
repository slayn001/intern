package org.raspen.sqlitetest.service;

import org.raspen.sqlitetest.model.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntriesService {
    @Autowired
    private org.raspen.sqlitetest.dao.configuration.PolicyRepository policyRepository;

    public List<Policy> findAllEntries() { return policyRepository.findAllEntries(); }
}
