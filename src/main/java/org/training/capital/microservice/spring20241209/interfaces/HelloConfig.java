package org.training.capital.microservice.spring20241209.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class HelloConfig {


    @Bean("tr_bean")
    public IHello helloBeanTr() {
        return new HelloTr();
    }

    @Bean("helloDynamic1")
    public IHello helloBeanEng(Environment environment) {
        String propertyLoc = environment.getProperty("app.language");
        return switch (propertyLoc) {
            case "tr" -> new HelloTr();
            default -> new HelloEng();
        };
    }

    @Bean("helloDynamic2")
    public IHello helloBeanEngX(ApplicationContext contextParam) {
        String propertyLoc = contextParam.getEnvironment()
                                         .getProperty("app.language");
        HelloEng helloEngLoc = contextParam.getBean("helloEng",
                                                    HelloEng.class);
        return switch (propertyLoc) {
            case "tr" -> new HelloTr();
            default -> new HelloEng();
        };
    }

    @Bean("helloDynamic3")
    public IHello helloBeanEngY(@Value("${app.language}") String language) {
        return switch (language) {
            case "tr" -> new HelloTr();
            default -> new HelloEng();
        };
    }

    @Bean("helloDynamic")
    public IHello helloBeanEngZ(IHello[] hellosParam,
                               @Value("${app.language}") String language) {
        for (IHello helloLoc : hellosParam) {
            if (helloLoc.language()
                        .equals(language)) {
                return helloLoc;
            }
        }
        return new HelloEng();
    }


    @Bean("tr_bean_deneme")
    public IHello helloBeanTr2() {
        return new HelloTr();
    }

}
