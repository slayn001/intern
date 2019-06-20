package org.raspen.sqlitetest.dao.configuration;

import org.raspen.sqlitetest.model.Policy;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolicyRepository extends CrudRepository<org.raspen.sqlitetest.model.Policy, Long> {
    @Query("select e from Policy e")
    List<Policy> findAllEntries();

    @Query("from Policy where state = ?1")
    List<Policy> findByState(String state);

    @Query("from Policy where policyLoadedWithError = ?1")
    List<Policy> filterLoadedWithError(String yesHuh);

    @Query("from Policy where writingCompany = ?1")
    List<Policy> filterWritingCompany(String a);

    @Query("from Policy where lineOfBusiness  = ?1")
    List<Policy> filterLineOfBusiness(String b);

}
