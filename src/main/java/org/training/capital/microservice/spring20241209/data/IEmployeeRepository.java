package org.training.capital.microservice.spring20241209.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.training.capital.microservice.spring20241209.sevices.models.Employee;

// @Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Long> {
}
