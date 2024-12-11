package org.training.capital.microservice.spring20241209.rest.models;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.training.capital.microservice.spring20241209.rest.validation.CheckNotAllowedWords;

@Data
public class EmployeeDto {
    @NotBlank
    @Size(min = 2,max = 15)
    @CheckNotAllowedWords({"abc","123","qwe"})
    private String name;
    @NotEmpty
    @Size(min = 3,max = 25)
    @CheckNotAllowedWords({"test","123","dene","bak"})
    private String surname;
    @NotNull
    private String phoneNumber;
    @CheckNotAllowedWords({"abc","123","qwe"})
    private String department;
    @Max(500)
    @Min(10)
    private Integer weight;
    @Max(300)
    @Min(50)
    private Integer height;


}
