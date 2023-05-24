package com.example.studentinformationsystem.serivce;

import com.example.studentinformationsystem.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
public interface StudentService {
    List<StudentModel> findAllStudent();

    StudentModel findByStudentNumber(long studentNumber);

    StudentModel findByEmail(String email);

    List<StudentModel> findAllByOrderByGpaDesc();

    StudentModel saveOrUpdateStudent(StudentModel student);

    void deleteStudentById(String id);

}
