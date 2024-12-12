package org.training.capital.microservice.spring20241209.sevices.models;

import jakarta.validation.constraints.*;
import org.training.capital.microservice.spring20241209.rest.validation.CheckNotAllowedWords;

import java.time.ZonedDateTime;

public class Employee {
    private String name;
    @NotEmpty
    private String surname;
    @NotNull
    private String phoneNumber;
    private String department;
    @Max(500)
    @Min(10)
    private Integer weight;
    @Max(300)
    @Min(50)
    private Integer height;
    private EEmployeeStatus employeeStatus;
    private ZonedDateTime creationTime;
    private ZonedDateTime updateTime;
}
