package com.springboot.springbootdemo.service;

import com.springboot.springbootdemo.entity.Course;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;
    public CourseServiceImpl()
    {
        list=new ArrayList<>();
        list.add(new Course(12,"Java","This course for core java"));
        list.add(new Course(13,"Spring Boot","Creating rest api using spring"));
    }
    public List<Course> getCourses()
    {
        return list;
    }

    @Override
    public Course getCourse(int id) {
        Course course1=null;
        for(Course course:list)
        {
            if(course.getId()==id)
            {
                course1=course;
                break;
            }
        }
        return course1;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course deleteCourse(int id) {
        Course course=null;
        for (Course course1:list)
        {
            if(course1.getId()==id)
            {
                list.remove(id);
                break;
            }
        }
        return course;

    }



}
