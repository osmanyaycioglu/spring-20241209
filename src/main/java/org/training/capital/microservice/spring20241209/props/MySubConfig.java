package org.training.capital.microservice.spring20241209.props;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class MySubConfig {

    @Size(min = 5)
    private String location;
    private String city;
    private String rule;

}
