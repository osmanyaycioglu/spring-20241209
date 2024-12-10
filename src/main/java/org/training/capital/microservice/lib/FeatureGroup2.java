package org.training.capital.microservice.lib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeatureGroup2 {

    @Bean
    public Feature3 feature3(){
        return new Feature3();
    }


}
