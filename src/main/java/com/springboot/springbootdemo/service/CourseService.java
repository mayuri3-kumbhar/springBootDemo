package com.springboot.springbootdemo.service;

import com.springboot.springbootdemo.entity.Course;


import java.util.List;

public interface CourseService {

    public  List<Course> getCourses();

    public Course getCourse(int id);

    public Course addCourse(Course course);

    public Course deleteCourse(int id);
}
