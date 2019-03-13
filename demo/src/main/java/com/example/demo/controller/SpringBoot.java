package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBoot {
    @RequestMapping("/spring1")
    public String spring1(){
        return "succes";
    }
}
