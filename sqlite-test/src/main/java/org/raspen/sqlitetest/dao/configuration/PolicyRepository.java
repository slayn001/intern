package org.raspen.sqlitetest.dao.configuration;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolicyRepository extends CrudRepository<org.raspen.sqlitetest.model.Policy, Long> {
    @Query("select e from Policy e")
    List<org.raspen.sqlitetest.model.Policy> findAllEntries();
}
