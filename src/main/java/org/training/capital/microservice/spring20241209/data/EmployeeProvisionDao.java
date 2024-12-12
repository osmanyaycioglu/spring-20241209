package org.training.capital.microservice.spring20241209.data;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.training.capital.microservice.spring20241209.sevices.models.Employee;

@Service
@RequiredArgsConstructor
public class EmployeeProvisionDao {
    private final IEmployeeRepository employeeRepository;

    @Transactional
    public void insert(Employee employeeParam) {
        employeeRepository.save(employeeParam);
    }

}
