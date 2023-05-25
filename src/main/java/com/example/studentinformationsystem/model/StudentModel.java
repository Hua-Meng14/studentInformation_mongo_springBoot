package com.example.studentinformationsystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "students")
public class StudentModel {

    @Id
    private String id;
    private String name;
    private String studentNumber;
    private String email;
    private List<String> courseList;
    private float gpa;

//    public Student() {
//
//    }
    public StudentModel(String name, String studentNumber, String email, List<String> courseList, float gpa) {
        this.name = name;
        this.courseList = courseList;
        this.email = email;
        this.gpa = gpa;
        this.studentNumber = studentNumber;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    public List<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", studentNumber=" + studentNumber +
                ", courseList=" + courseList +
                ", gpa=" + gpa +
                '}';
    }
}
