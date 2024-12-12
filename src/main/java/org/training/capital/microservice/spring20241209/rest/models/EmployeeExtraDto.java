package org.training.capital.microservice.spring20241209.rest.models;

import lombok.Data;

@Data
public class EmployeeExtraDto {
    private String gender;
    private String group;
    private Integer score;
}
