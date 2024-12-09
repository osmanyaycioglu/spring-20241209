package org.training.capital.microservice.spring20241209.interfaces;

import org.springframework.stereotype.Component;

@Component
public class HelloTr implements IHello{
    @Override
    public String sayHello(final String name) {
        return "Selam " + name;
    }

    @Override
    public String sayGoodbye(final String name) {
        return "Güle güle " + name;
    }

    @Override
    public String language() {
        return "tr";
    }

}
