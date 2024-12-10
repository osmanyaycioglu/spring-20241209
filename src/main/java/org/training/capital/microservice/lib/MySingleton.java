package org.training.capital.microservice.lib;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Lazy
@Component
public class MySingleton {

    private Map<String,String> stringStringMap = new HashMap<>();

    public void method(){
    }

}
