package org.training.capital.microservice.spring20241209.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping("/helloworld")
    public String method1(){
        return "Hello world GET";
    }

    @PostMapping("/helloworld")
    public String method2(){
        return "Hello world POST";
    }

    @PutMapping("/helloworld")
    public String method3(){
        return "Hello world PUT";
    }

    @PatchMapping("/helloworld")
    public String method4(){
        return "Hello world PATCH";
    }

}
