package com.nagp;

import java.util.TimeZone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Entry point for the employee service. */
@SpringBootApplication
public class EmployeeApplication {

  /** Starts the Spring Boot application. */
  public static void main(String[] args) {
    System.out.println("Timezone: " + java.util.TimeZone.getDefault().getID());
    TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kolkata"));
    System.out.println("Timezone: " + java.util.TimeZone.getDefault().getID());
    SpringApplication.run(EmployeeApplication.class, args);
  }
}