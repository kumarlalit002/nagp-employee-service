package com.nagp.controller;

import com.nagp.entity.Employee;
import com.nagp.service.EmployeeService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** REST endpoint controller for employee operations. */
@RestController
@RequiredArgsConstructor
public class EmployeeController {

  private final EmployeeService employeeService;

  /** Endpoint to get list of all employees. */
  @GetMapping("/employees")
  public List<Employee> getEmployees() {
    return employeeService.getAllEmployees();
  }
}