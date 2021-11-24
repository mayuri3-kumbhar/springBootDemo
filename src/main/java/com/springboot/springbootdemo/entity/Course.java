package com.springboot.springbootdemo.entity;

import org.springframework.stereotype.Service;

@Service
public class Course {
    private int id;
    private String CourseName;
    private String desription;

    public Course(int id, String courseName, String desription) {
        this.id = id;
        CourseName = courseName;
        this.desription = desription;
    }

    public Course() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", CourseName='" + CourseName + '\'' +
                ", desription='" + desription + '\'' +
                '}';
    }
}
