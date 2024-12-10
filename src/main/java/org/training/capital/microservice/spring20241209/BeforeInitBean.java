package org.training.capital.microservice.spring20241209;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.training.capital.microservice.spring20241209.interfaces.IHello;
import org.training.capital.microservice.spring20241209.interfaces.MyOtherScopeObject;

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

    @Autowired
    private MyOtherScopeObject otherScopeObject1;

    @Autowired
    private MyOtherScopeObject otherScopeObject2;

    @Autowired
    private MyOtherScopeObject otherScopeObject3;

    // Constructor Injection
    // @Autowired
    public BeforeInitBean(@Qualifier("benim") final ICache cacheParam,
                          @Qualifier("helloDynamic") final IHello helloParam) {
        // early init
        cache = cacheParam;
        // during init
        hello = helloParam;
        // last init
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
        otherScopeObject1.increase();
        otherScopeObject2.increase();
        otherScopeObject3.increase();

        System.out.println("Object 1 : " + otherScopeObject1.getCount());
        System.out.println("Object 2 : " + otherScopeObject2.getCount());
        System.out.println("Object 3 : " + otherScopeObject3.getCount());

    }
}
