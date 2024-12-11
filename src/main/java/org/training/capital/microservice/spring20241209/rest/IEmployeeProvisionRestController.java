package org.training.capital.microservice.spring20241209.rest;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.bind.annotation.*;
import org.training.capital.microservice.spring20241209.rest.models.AddEmployeeResponse;
import org.training.capital.microservice.spring20241209.rest.models.EmployeeDto;


// Business command 5 method
public interface IEmployeeProvisionRestController {

    @Operation(summary = "add new employee",description = """
                                                          add new employee
                                                          sjahdas
                                                          asjdhakjsd
                                                          akhjasgdkjhasd
                                                          lajshdkjashd
                                                          dalshdkasjd
                                                          
                                                          """)
    AddEmployeeResponse addEmployee(@Valid @RequestBody EmployeeDto employeeDtoParam);


    void disableEmployee(@NotBlank @RequestParam("eid") String employeeId);

    void suspendEmployee(@RequestParam("eid") String employeeId);

    public void enableEmployee(String employeeId);

}
