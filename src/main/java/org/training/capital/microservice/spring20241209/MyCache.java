package org.training.capital.microservice.spring20241209;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
// myCache --> camel
// my_cache --> snake
// my-cache --> kebap
// MyCache --> pascal

@Qualifier("benim")
// @Primary
@Component
//@Service
//@Controller
//@Repository
//@Configuration
public class MyCache implements ICache {
    private String cacheName;

    public void add(String name) {
        System.out.println("My cache running  : " + name);

    }

}
