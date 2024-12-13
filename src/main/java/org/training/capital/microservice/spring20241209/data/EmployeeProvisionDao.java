package org.training.capital.microservice.spring20241209.data;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.training.capital.microservice.spring20241209.sevices.models.Employee;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeProvisionDao {
    private final IEmployeeRepository employeeRepository;

    @Transactional
    public void insert(Employee employeeParam) {
        employeeParam.getEmployeePhones()
                     .forEach(e -> e.setEmployee(employeeParam));

        employeeRepository.save(employeeParam);
    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public List<Employee> findByName(final String nameParam) {
        return employeeRepository.searchName(nameParam);
    }
}
