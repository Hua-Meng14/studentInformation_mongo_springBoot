package com.example.studentinformationsystem.respository;

import com.example.studentinformationsystem.model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<StudentModel, String> {
    StudentModel findStudentByStudentNumber(long studentNumber);
    StudentModel findByEmail(String email);

    List<StudentModel> findAllByOrderByGpaDesc();
}
