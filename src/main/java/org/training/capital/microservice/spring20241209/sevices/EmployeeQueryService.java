package org.training.capital.microservice.spring20241209.sevices;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.training.capital.microservice.spring20241209.data.EmployeeProvisionDao;
import org.training.capital.microservice.spring20241209.sevices.models.Employee;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeQueryService {
    private final EmployeeProvisionDao employeeProvisionDao;


    public List<Employee> getAllEmployees(){
        return employeeProvisionDao.getAllEmployee();
    }

    public List<Employee> getAllEmployeesByName(final String nameParam) {
        return employeeProvisionDao.findByName(nameParam);
    }
}
