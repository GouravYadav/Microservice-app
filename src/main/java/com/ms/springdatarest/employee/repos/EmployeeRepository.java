package com.ms.springdatarest.employee.repos;

import org.springframework.data.repository.CrudRepository;

import com.ms.springdatarest.employee.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
