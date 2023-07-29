package com.example.demo.controller;

import com.example.demo.entities.Courses;
import com.example.demo.services.CourseService;
import com.example.demo.services.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//we have created this controller - how can we tell springboot about this controller
//Representation State Transfer
@RestController
public class MyController {

    //please springboot get the object for this implementation class - autowired
    @Autowired
    private CourseService courseService;


    //get the courses
    @GetMapping("/courses")
    public List<Courses> getCourses(){
        return this.courseService.getCourses();  //calling a specific service for our use
    }

    //get course by id
    @GetMapping("/courses/{courseId}")
    public Courses getCourses(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));  //calling a specific service for our use
    }







}
