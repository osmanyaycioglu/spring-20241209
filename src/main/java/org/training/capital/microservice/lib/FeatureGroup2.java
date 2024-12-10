package org.training.capital.microservice.lib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeatureGroup2 {

    @Bean
    public Feature3 feature1(){
        return new Feature3();
    }


}
