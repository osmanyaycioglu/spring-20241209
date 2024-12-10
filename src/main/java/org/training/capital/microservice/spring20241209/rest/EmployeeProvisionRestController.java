package org.training.capital.microservice.spring20241209.rest;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.bind.annotation.*;
import org.training.capital.microservice.spring20241209.rest.models.AddEmployeeResponse;
import org.training.capital.microservice.spring20241209.rest.models.EmployeeDto;


// Business command 5 method
@RestController
@RequestMapping("/api/v1/employee/provision")
@Valid
public class EmployeeProvisionRestController {

    @PostMapping("/add")
    public AddEmployeeResponse addEmployee(@Valid @RequestBody EmployeeDto employeeDtoParam){
        return null;
    }

    @GetMapping("/disable")
    public void disableEmployee(@NotBlank @RequestParam("eid") String employeeId){
    }

    @GetMapping("/suspend")
    public void suspendEmployee(@RequestParam("eid") String employeeId){
    }

    @GetMapping("/enable")
    public void enableEmployee(String employeeId){
    }

}
