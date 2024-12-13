package org.training.capital.microservice.spring20241209.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NameInfo {
    private String name;
    private String surname;
}
