package org.training.capital.microservice.lib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeatureGroup3 {

    @Bean
    public Feature4 feature4(){
        return new Feature4();
    }

    @Bean
    public Feature5 feature5(){
        return new Feature5();
    }

}
