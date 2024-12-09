package org.training.capital.microservice.spring20241209.interfaces;

import org.springframework.stereotype.Component;

@Component
public class HelloEsp implements IHello{

    @Override
    public String sayHello(final String name) {
        return "Ola " + name;
    }

    @Override
    public String sayGoodbye(final String name) {
        return "Adios " + name;
    }

    @Override
    public String language() {
        return "esp";
    }
}
