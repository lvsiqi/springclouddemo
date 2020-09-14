package com.lvsiqi.producterb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/")
    private String sayHello(){
        return "hello this is B";
    }
}
