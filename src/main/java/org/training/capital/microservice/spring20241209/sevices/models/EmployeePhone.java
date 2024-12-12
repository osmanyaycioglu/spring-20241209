package org.training.capital.microservice.spring20241209.sevices.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class EmployeePhone {
    @Id
    @GeneratedValue
    private Long epId;
    private String name;
    private String number;
}
