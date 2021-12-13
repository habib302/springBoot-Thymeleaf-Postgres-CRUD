package com.habib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.habib.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
