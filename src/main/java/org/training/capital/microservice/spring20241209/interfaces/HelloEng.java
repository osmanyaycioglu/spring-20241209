package org.training.capital.microservice.spring20241209.interfaces;

import org.springframework.stereotype.Component;

@Component
public class HelloEng implements IHello{

    @Override
    public String sayHello(final String name) {
        return "Hello " + name;
    }

    @Override
    public String sayGoodbye(final String name) {
        return "Goodbye " + name;
    }

    @Override
    public String language() {
        return "eng";
    }
}
