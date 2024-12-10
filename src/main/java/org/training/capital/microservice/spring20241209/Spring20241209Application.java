package org.training.capital.microservice.spring20241209;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.training.capital.microservice.lib.Feature2;
import org.training.capital.microservice.lib.FeatureGroup1;
import org.training.capital.microservice.lib.FeatureGroup2;
import org.training.capital.microservice.spring20241209.interfaces.IHello;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages = {"org.training.capital.microservice.spring20241209",
//                                           "org.training.capital.microservice.lib"
//})
@Import({FeatureGroup1.class,
         FeatureGroup2.class
})
public class Spring20241209Application {

}
