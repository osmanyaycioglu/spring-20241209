package org.training.capital.microservice.spring20241209.sevices.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class EmployeeExtra {
    @Id
    @GeneratedValue
    private Long eeId;
    private String gender;
    @Column(name = "emp_group")
    private String group;
    @Column(name = "emp_score")
    private Integer score;
}
