package com.example.demo.services;

import com.example.demo.entities.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//This is a service class, and it will provide implementation
@Service
public class CourseServiceImpl implements CourseService{

    //creating temporary list in here for our usage!
    List<Courses> list;

    public CourseServiceImpl(){
        //You can also fetch this from database (using DAO layer)
        list = new ArrayList<>();
        list.add(new Courses(124, "Java Core Course", "This is course contains basics of Java"));
        list.add(new Courses(134, "Python Core Course", "This is course contains basics of Python"));
    }

    @Override
    public List<Courses> getCourses() {
        return list;
    }
    @Override
    public Courses getCourse(long courseId) {
        Courses c = null;
        for(Courses course : list){
            if(course.getId() == courseId) c = course;
        }
        return c;
    }

    @Override
    public Courses addCourse(Courses course) {
        list.add(course);
        return course;
    }
}
