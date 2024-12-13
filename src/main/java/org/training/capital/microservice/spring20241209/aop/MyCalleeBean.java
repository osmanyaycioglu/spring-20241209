package org.training.capital.microservice.spring20241209.aop;

import org.springframework.stereotype.Component;

@Component
public class MyCalleeBean {


    public String hello(String name) {
        System.out.println("MyCallee hello running");
        return "Hello AOP : " + name;
    }

}
