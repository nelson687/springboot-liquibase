
package com.test.flights.domain;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface TestTableDao extends CrudRepository<TestTable, Long> {

}