package com.example.demo.controller;

import com.example.demo.entities.Coures;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//we have created this controller - how can we tell springboot about this controller
//Representation State Transfer
@RestController
public class MyController {

//    @GetMapping("/home")
//    public String home(){
//        return "Welcome to courses application";
//    }

    //get the courses
    @GetMapping("/courses")
    public List<Coures> getCourses(){
        //contact dusre service layer
        return null;
    }






}
