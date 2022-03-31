package com.ems.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.server.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
