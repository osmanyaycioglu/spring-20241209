package org.training.capital.microservice.spring20241209.async;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Configuration
public class AsyncConfig {

    @Bean
    public ExecutorService myExecutors(){
        return Executors.newFixedThreadPool(10);
    }

}
