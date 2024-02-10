package com.dimension.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    // http://localhost:8001/hola
    @GetMapping("/hola")
    public String helloWorld() {
        return "Hello World!";
    }

}
