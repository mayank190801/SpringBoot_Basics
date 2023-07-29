package com.example.demo.services;

import com.example.demo.entities.Courses;

import java.util.List;

public interface CourseService {

    public List<Courses> getCourses();
    public Courses getCourse(long courseId);
}
