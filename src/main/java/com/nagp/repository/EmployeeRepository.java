package com.nagp.repository;

import com.nagp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/** Database repository interface for Employee entity. */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}