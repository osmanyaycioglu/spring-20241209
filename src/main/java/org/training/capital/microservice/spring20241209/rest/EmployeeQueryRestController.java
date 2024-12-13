package org.training.capital.microservice.spring20241209.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.training.capital.microservice.spring20241209.aop.MyTrace;
import org.training.capital.microservice.spring20241209.rest.mappers.IEmployeeMapper;
import org.training.capital.microservice.spring20241209.rest.models.EmployeeDto;
import org.training.capital.microservice.spring20241209.sevices.EmployeeQueryService;

import java.util.List;

// Query 10 method
@RestController
@RequestMapping("/api/v1/employee/query")
@RequiredArgsConstructor
public class EmployeeQueryRestController {
    private final EmployeeQueryService employeeQueryService;


    @MyTrace("find all")
    @GetMapping("/find/all")
    public List<EmployeeDto> getAllEmployee() {
        return IEmployeeMapper.EMPLOYEE_MAPPER.toEmployeeDtos(employeeQueryService.getAllEmployees());
    }

    @GetMapping("/find/by/name")
    public List<EmployeeDto> findAllEmployeeByName(@RequestParam("name") String name) {
        return IEmployeeMapper.EMPLOYEE_MAPPER.toEmployeeDtos(employeeQueryService.getAllEmployeesByName(name));
    }

}
