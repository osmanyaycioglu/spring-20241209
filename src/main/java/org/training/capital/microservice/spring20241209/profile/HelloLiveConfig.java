package org.training.capital.microservice.spring20241209.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.training.capital.microservice.spring20241209.interfaces.HelloEng;
import org.training.capital.microservice.spring20241209.interfaces.HelloTr;
import org.training.capital.microservice.spring20241209.interfaces.IHello;

@Profile("live")
@Configuration
public class HelloLiveConfig {

    @Bean
    public IHello helloBean(){
        return new HelloEng();
    }

}
