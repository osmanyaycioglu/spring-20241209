package org.training.capital.microservice.spring20241209.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.training.capital.microservice.spring20241209.interfaces.IHello;

@RestController
@RequestMapping("/my/hello")
public class MyHelloRestController {
    private IHello hello;

    public MyHelloRestController(@Qualifier("helloDynamic") final IHello helloParam) {
        hello = helloParam;
    }

    @GetMapping("/say/hello")
    public String sayHello(@RequestParam("name") String name){
        return hello.sayHello(name);
    }

    @GetMapping("/say/goodbye")
    public String sayGoodbye(@RequestParam("name") String name){
        return hello.sayGoodbye(name);
    }

}
