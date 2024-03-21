package com.imperativeapproach.imperativelastic.repository;

import com.imperativeapproach.imperativelastic.entities.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface EmployeeRepository extends ElasticsearchRepository<Employee, Long> {

    List<Employee> findByFirstNameAndLastName(String firstName, String lastName);

    List<Employee> findBySalaryBetween(Long startingSalary, Long endingSalary);


}
