package org.training.capital.microservice.spring20241209.rest;

import org.springframework.beans.factory.annotation.Autowired;
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
    private IHello helloFromProfile;

    @Autowired(required = false)
    @Qualifier("myConditionHello")
    private IHello helloCondition;

    public MyHelloRestController(@Qualifier("helloDynamic") final IHello helloParam,
                                 @Qualifier("helloBean") final IHello helloParam2) {
        hello            = helloParam;
        helloFromProfile = helloParam2;
    }

    @GetMapping("/say/hello/v1")
    public String sayHello(@RequestParam("name") String name) {
        return hello.sayHello(name);
    }

    @GetMapping("/say/goodbye/v1")
    public String sayGoodbye(@RequestParam("name") String name) {
        return hello.sayGoodbye(name);
    }

    @GetMapping("/say/hello/v2")
    public String sayHello2(@RequestParam("name") String name) {
        return helloFromProfile.sayHello(name);
    }

    @GetMapping("/say/goodbye/v2")
    public String sayGoodbye2(@RequestParam("name") String name) {
        return helloFromProfile.sayGoodbye(name);
    }

    @GetMapping("/say/hello/v3")
    public String sayHello3(@RequestParam("name") String name) {
        if (helloCondition != null) {
            return helloCondition.sayHello(name);
        }
        return "no luck";
    }

}
