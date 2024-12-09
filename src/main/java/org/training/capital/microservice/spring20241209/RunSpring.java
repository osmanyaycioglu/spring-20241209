package org.training.capital.microservice.spring20241209;

import org.springframework.boot.SpringApplication;

public class RunSpring {

    public static void main(String[] args) {
        SpringApplication.run(Spring20241209Application.class,
                              args);
        Car carLoc = new Car();
        carLoc.setName("test");
        Car carLoc2 = new Car();
        Car carLoc3 = new Car();
        carLoc.getModel();

    }
}
