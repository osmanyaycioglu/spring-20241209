package org.training.capital.microservice.spring20241209.sevices.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue
    private Long employeeId;
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

    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private EmployeeExtra employeeExtra;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<EmployeePhone> employeePhones;
}
