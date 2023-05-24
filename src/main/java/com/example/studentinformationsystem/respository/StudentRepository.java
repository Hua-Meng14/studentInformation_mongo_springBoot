package com.example.studentinformationsystem.respository;

import com.example.studentinformationsystem.model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentRepository extends MongoRepository<StudentModel, String> {
    StudentModel findStudentByNumber(long studentNumber);
    StudentModel findByEmail(String email);
    List<StudentModel> findAllByOrderByGpaDesc();
}
