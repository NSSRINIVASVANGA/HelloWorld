package com.example.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloworldController {
    @GetMapping("/")
    public String getHelloWorld() {
        return "Hello World";
    }

    @GetMapping("/name")
    public String getName() {
        return "Hello Srinivas";
    }

}