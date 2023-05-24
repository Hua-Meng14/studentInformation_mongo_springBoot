package com.example.studentinformationsystem.controller;


import com.example.studentinformationsystem.model.StudentModel;
import com.example.studentinformationsystem.serivce.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentRestcController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public List<StudentModel> getAllStudents() {
        return studentService.findAllStudent();
    }

    @GetMapping("/{studentNumber}")
    public StudentModel getStudentByStudentNumber(@PathVariable("studentNumber") long studentNumber) {
        return studentService.findByStudentNumber(studentNumber);
    }

    @GetMapping("/{email}")
    public StudentModel getStudentByEmail(@PathVariable("email") String email) {
        return studentService.findByEmail(email);
    }

    @GetMapping("/orderByGpa")
    public List<StudentModel> findAllByOrderByGpaDesc() {
        return studentService.findAllByOrderByGpaDesc();
    }

    @PostMapping("/")
    public ResponseEntity<?> saveOrUpdateStudent(@RequestBody StudentModel studentModel) {
        studentService.saveOrUpdateStudent(studentModel);
        return new ResponseEntity("Student added succesfully", HttpStatus.OK);
    }

    @DeleteMapping("/{studentNumber}")
    public ResponseEntity<?> deleteStudentByStudentNumber(@PathVariable("studentNumber") long studentNumber) {
        studentService.deleteStudentById(studentService.findByStudentNumber(studentNumber).getId());
        return new ResponseEntity("Student deleted succesfully", HttpStatus.OK);
    }
}
