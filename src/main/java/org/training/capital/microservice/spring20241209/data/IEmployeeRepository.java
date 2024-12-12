package org.training.capital.microservice.spring20241209.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.training.capital.microservice.spring20241209.sevices.models.Employee;

import java.util.List;

// @Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Long> {
    // select * from employee e where e.name=? order by e.surname
    // select e from Employee e where e.name=? order by e.surname
    List<Employee> findByNameOrderBySurname(String name);

}
