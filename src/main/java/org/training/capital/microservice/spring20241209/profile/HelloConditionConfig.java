package org.training.capital.microservice.spring20241209.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.training.capital.microservice.spring20241209.interfaces.HelloTr;
import org.training.capital.microservice.spring20241209.interfaces.IHello;

@MyCondition(key = "my.condition.test",value = "out")
@Configuration
public class HelloConditionConfig {

    @Bean
    public IHello myConditionHello(){
        return new HelloTr();
    }

}
