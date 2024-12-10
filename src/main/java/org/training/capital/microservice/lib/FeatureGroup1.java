package org.training.capital.microservice.lib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeatureGroup1 {

    @Bean
    public Feature1 feature1(){
        return new Feature1();
    }

    @Bean
    public Feature2 feature2(){
        return new Feature2();
    }

}
