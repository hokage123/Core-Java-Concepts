package com.imperativeapproach.imperativelastic.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.imperativeapproach.imperativelastic.entities.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;
import java.util.stream.Stream;

public interface EmployeeRepository extends ElasticsearchRepository<Employee, Long> {

    List<Employee> findByFirstNameAndLastName(String firstName, String lastName);

    List<Employee> findBySalaryBetween(Long startingSalary, Long endingSalary);

    @Query("{\"match\": {\"salary\": {\"query\":: \"?0\"}}}")
    Page<Employee> findBySalary(Long salary, Pageable pageable);

    Stream<Employee> findAllBySalary(Long salary);

}
