package com.mayank.secondApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //end point (start)
    @GetMapping("/")
    public String sayHello(){
        return "Hello world!";
    }
    @GetMapping("/fortune")
    public String getFortune(){
        return "Today is your lucky day!";
    }

    //made some change









}
