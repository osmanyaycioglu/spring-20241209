package org.training.capital.microservice.spring20241209.aop;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MyAspectTest implements CommandLineRunner {
    private final MyCalleeBean myCalleeBean;

    @Override
    public void run(final String... args) throws Exception {
        System.out.println("*0*********** AOP : " + myCalleeBean.hello("osman"));
    }
}
