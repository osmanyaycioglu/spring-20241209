package org.training.capital.microservice.spring20241209.rest.models;

import jakarta.validation.constraints.*;

public class EmployeeDto {
    @NotBlank
    @Size(min = 2,max = 15)
    private String name;
    @NotEmpty
    @Size(min = 3,max = 25)
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


    public String getName() {
        return name;
    }

    public void setName(final String nameParam) {
        name = nameParam;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surnameParam) {
        surname = surnameParam;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumberParam) {
        phoneNumber = phoneNumberParam;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(final String departmentParam) {
        department = departmentParam;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(final Integer weightParam) {
        weight = weightParam;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(final Integer heightParam) {
        height = heightParam;
    }
}
