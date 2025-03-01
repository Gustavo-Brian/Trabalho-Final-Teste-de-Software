package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/john")
public class JohnWorld {

    @GetMapping()
    public String getMethodName() {
        return "eae";
    }
    
}