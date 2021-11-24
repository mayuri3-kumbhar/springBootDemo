package com.springboot.springbootdemo.controller;

import com.springboot.springbootdemo.entity.Course;
import com.springboot.springbootdemo.service.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

  @GetMapping("/home")
    public String home()
    {
        return "Welcome to courses";
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {

        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{id}")
    public Course getCourse(@PathVariable int id)
    {
      return this.courseService.getCourse(id);
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return this.courseService.addCourse(course);
    }

    @DeleteMapping("/courses")
    public Course deleteCourse(@RequestBody int id)
    {
        return  this.courseService.deleteCourse(id);
    }


}
