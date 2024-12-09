package org.training.capital.microservice.spring20241209;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.training.capital.microservice.spring20241209.interfaces.IHello;

@Component
public class BeforeInitBean implements CommandLineRunner {
    private ICache cache;
    private IHello hello;

    // Field Injection
    @Autowired
    @Qualifier("benim")
    private ICache cache2;
    @Autowired
    @Qualifier("helloDynamic")
    private IHello hello2;


    // Constructor Injection
    // @Autowired
    public BeforeInitBean(@Qualifier("benim") final ICache cacheParam,
                          @Qualifier("helloDynamic") final IHello helloParam) {
        cache = cacheParam;
        hello = helloParam;
    }

    // Method Injection
    @Autowired
    public void method(@Qualifier("benim") final ICache cacheParam) {
    }

    @PostConstruct
    public void abc() {
        System.out.println("Before ready state");
    }

    @Override
    public void run(final String... args) throws Exception {
        cache.add("osman");
        System.out.println("say : " + hello.sayHello("osman"));

    }
}
