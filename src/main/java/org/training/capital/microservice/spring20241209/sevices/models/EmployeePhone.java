package org.training.capital.microservice.spring20241209.sevices.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class EmployeePhone {
    @Id
    @GeneratedValue
    private Long   epId;
    private String name;
    private String number;

    @ManyToOne(fetch = FetchType.EAGER)
    // @JsonIgnore
    @JoinColumn(name = "employee_id", nullable = false)
    @NotNull
    private Employee employee;
}
