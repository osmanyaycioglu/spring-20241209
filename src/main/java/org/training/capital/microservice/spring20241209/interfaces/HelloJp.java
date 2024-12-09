package org.training.capital.microservice.spring20241209.interfaces;

import org.springframework.stereotype.Component;

@Component
public class HelloJp implements IHello{

    @Override
    public String sayHello(final String name) {
        return "Ha " + name;
    }

    @Override
    public String sayGoodbye(final String name) {
        return "Ho " + name;
    }

    @Override
    public String language() {
        return "jp";
    }
}
