package com.nagp.service;

import com.nagp.entity.Employee;
import com.nagp.repository.EmployeeRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/** Handles business logic for employees. */
@Service
@RequiredArgsConstructor
public class EmployeeService {

  private final EmployeeRepository employeeRepository;

  /** Fetches all employees from the repository. */
  public List<Employee> getAllEmployees() {
    return employeeRepository.findAll();
  }
}