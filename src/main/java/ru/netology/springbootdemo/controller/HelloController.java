package ru.netology.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

//@RestController

public class HelloController {
    public HelloController() {
        super();
    }

    @Value("${hello.from:defolt}")
    private String from;


    @GetMapping("/")
    private String hello() {
        return String.format("Это ответ %s!", from);
    }
}
