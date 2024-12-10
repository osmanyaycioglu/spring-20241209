package org.training.capital.microservice.spring20241209.rest.models;

public class AddEmployeeResponse {
    private String employeeId;
    private String description;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(final String employeeIdParam) {
        employeeId = employeeIdParam;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String descriptionParam) {
        description = descriptionParam;
    }
}
