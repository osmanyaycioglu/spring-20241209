package org.training.capital.microservice.spring20241209.props;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.time.Duration;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "my.virtual.app")
@Data
@Validated
public class MyAppConfig {
    @NotBlank
    private String       appName;
    @Size(min = 3,max = 15)
    private String       appVersion;
    private Integer      dynamicSocketStart;
    private Integer      dynamicSocketEnd;
    private Duration     watchdogPeriod;
    private Long         initialWait;
    @Valid
    private MySubConfig  extraProps;
    private List<String> locations;
    private List<Phone>  phones;
    private Map<String,Phone> phoneMap;

}
