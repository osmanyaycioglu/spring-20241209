package org.training.capital.microservice.spring20241209.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.training.capital.microservice.spring20241209.rest.models.EmployeeDto;

import java.util.List;

// Query 10 method
@RestController
@RequestMapping("/api/v1/employee/query")
public class EmployeeQueryRestController {

    @GetMapping("/find/all")
    public List<EmployeeDto> getAllEmployee(){
        return null;
    }

}
