package com.nathan.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
    
    @GetMapping("/api/hello")
    public String sendHello() {
        return "Hello, World!";
    }
}
