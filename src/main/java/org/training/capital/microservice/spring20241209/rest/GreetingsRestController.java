package org.training.capital.microservice.spring20241209.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingsRestController {

    // /greetings/greet?name=osman&surname=yaycioglu
    @GetMapping("/greet")
    public String greet(@RequestParam("name") String name,
                        @RequestParam("surname") String surname) {
        return "Greetings " + name + " " + surname;
    }


    // /greetings/greet2/osman/yaycioglu
    @GetMapping("/greet2/{isim}/{soyisim}")
    public String greet2(@PathVariable("isim") String name,
                         @PathVariable("soyisim") String surname) {
        return "Greetings 2 " + name + " " + surname;
    }

    // /greetings/greet3/osman?soyisim=yaycioglu
    @GetMapping("/greet3/{isim}")
    public String greet3(@PathVariable("isim") String name,
                         @RequestParam("soyisim") String surname) {
        return "Greetings 3 " + name + " " + surname;
    }
    // /greetings/greet4/osman;soy=yaycioglu
    @GetMapping("/greet4/{isim}")
    public String greet4(@PathVariable("isim") String name,
                         @MatrixVariable("soy") String surname) {
        return "Greetings 4 " + name + " " + surname;
    }


}
