package org.training.capital.microservice.spring20241209;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
// myCache --> camel
// my_cache --> snake
// my-cache --> kebap
// MyCache --> pascal


@Component
// @Service
public class MyCache {
    private String cacheName;

    public void add(String name) {
    }

}
