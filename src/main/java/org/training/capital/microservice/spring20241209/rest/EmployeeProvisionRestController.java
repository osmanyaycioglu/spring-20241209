package org.training.capital.microservice.spring20241209.rest;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;
import org.training.capital.microservice.spring20241209.ICache;
import org.training.capital.microservice.spring20241209.rest.mappers.IEmployeeMapper;
import org.training.capital.microservice.spring20241209.rest.models.AddEmployeeResponse;
import org.training.capital.microservice.spring20241209.rest.models.EmployeeDto;
import org.training.capital.microservice.spring20241209.sevices.EmployeeProvisionService;


// Business command 5 method
@RestController
@RequestMapping("/api/v1/employee/provision")
@Valid
@RequiredArgsConstructor
public class EmployeeProvisionRestController implements IEmployeeProvisionRestController {
    private final EmployeeProvisionService employeeProvisionService;

    @PostMapping("/add")
    public AddEmployeeResponse addEmployee(@Valid @RequestBody EmployeeDto employeeDtoParam) {
        employeeProvisionService.addEmployee(IEmployeeMapper.EMPLOYEE_MAPPER.toEmployee(employeeDtoParam));
        return null;
    }

    @GetMapping("/disable")
    public void disableEmployee(@NotBlank @RequestParam("eid") String employeeId) {
    }

    @GetMapping("/suspend")
    public void suspendEmployee(@RequestParam("eid") String employeeId) {
    }

    @GetMapping("/enable")
    public void enableEmployee(String employeeId) {
    }

}
