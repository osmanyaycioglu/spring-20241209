package org.training.capital.microservice.spring20241209.sevices;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.training.capital.microservice.spring20241209.data.EmployeeProvisionDao;
import org.training.capital.microservice.spring20241209.data.IEmployeeRepository;
import org.training.capital.microservice.spring20241209.sevices.models.Employee;

@Service
@RequiredArgsConstructor
public class EmployeeProvisionService {
    private final EmployeeProvisionDao employeeProvisionDao;


    public void addEmployee(Employee employeeParam){
        employeeProvisionDao.insert(employeeParam);
    }
}
