package org.training.capital.microservice.spring20241209;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
// myCache --> camel
// my_cache --> snake
// my-cache --> kebap
// MyCache --> pascal

@Qualifier("diger")
@Component
// @Service
public class OtherCache implements ICache {
    private String cacheName;

    public void add(String name) {
        System.out.println("Other cache running  : " + name);
    }

}
