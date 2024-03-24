package com.imperativeapproach.imperativelastic.service;

import com.imperativeapproach.imperativelastic.entities.Employee;
import com.imperativeapproach.imperativelastic.repository.EmployeeRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.List;
import java.util.stream.Stream;

@Service
public class EmployeeRepositoryService {

    private final EmployeeRepository employeeRepository;

    public EmployeeRepositoryService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long employeeId)
    {
        employeeRepository.deleteById(employeeId);
    }

    public Employee getEmployee(Long employeeId)
    {
        Optional<Employee> employeeOptional = employeeRepository.findById(employeeId);
        return employeeOptional.orElse(null);
    }

    public List<Employee> searchEmployeeWithSalaryBetween(Long startingSalary, Long endingSalary)
    {
        return employeeRepository.findBySalaryBetween(startingSalary, endingSalary);
    }

    public List<Employee> searchSalaryQuery(Long salary)
    {
        Pageable pageable = PageRequest.of(0,10, Sort.by("salary"));
        return employeeRepository.findBySalary(salary, pageable).getContent();
    }

    public List<Employee> getEmployeeByFirstAndLastName(String firstName, String lastName)
    {
        return employeeRepository.findByFirstNameAndLastName(firstName, lastName);
    }

    public List<Employee> getEmployeeUsingScroll(Long salary)
    {
        Stream<Employee> stream = employeeRepository.findAllBySalary(salary);

        List<Employee> employees = new ArrayList<>();
        employees = stream.toList();
        stream.close();

        return employees;
    }
}
