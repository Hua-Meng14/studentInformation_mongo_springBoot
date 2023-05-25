package com.example.studentinformationsystem;

import com.example.studentinformationsystem.model.StudentModel;
import com.example.studentinformationsystem.serivce.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentRestController {

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping(value = "/students")
    public List<StudentModel> getAllStudents() {
        return studentService.findAllStudent();
    }

    @GetMapping(value = "/students/{studentNumber}")
    public StudentModel getStudentByStudentNumber(@PathVariable("studentNumber") Long studentNumber) {
        return studentService.findByStudentNumber(studentNumber);
    }

    @GetMapping(value = "/students/email/{email}")
    public StudentModel getStudentByEmail(@PathVariable("email") String email) {
        return studentService.findByEmail(email);
    }

    @GetMapping(value = "/students/order-by-gpa")
    public List<StudentModel> findAllByOrderByGpaDesc() {
        return studentService.findAllByOrderByGpaDesc();
    }

    @PostMapping(value = "/students/save")
    public ResponseEntity<?> saveOrUpdateStudent(@RequestBody StudentModel studentModel) {
        studentService.saveOrUpdateStudent(studentModel);
        return new ResponseEntity("Student added successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/students/{studentNumber}")
    public ResponseEntity<?> deleteStudentByStudentNumber(@PathVariable long studentNumber) {
        studentService.deleteStudentById(studentService.findByStudentNumber(studentNumber).getId());
        return new ResponseEntity("Student deleted successfully", HttpStatus.OK);
    }
}
