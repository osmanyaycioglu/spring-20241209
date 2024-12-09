package org.training.capital.microservice.spring20241209;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring20241209Application {
    @Autowired
    private MyCache myCache;

}
