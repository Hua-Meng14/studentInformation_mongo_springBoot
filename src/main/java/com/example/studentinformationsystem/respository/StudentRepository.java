package com.example.studentinformationsystem.respository;

import com.example.studentinformationsystem.model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<StudentModel, String> {
    @Query("{studentNumber:'?0'}")
    StudentModel findStudentByStudentNumber(long studentNumber);

    @Query("{email:'?0'}")
    StudentModel findByEmail(String email);

    @Query(value = "{gpa:'?0'}")
    List<StudentModel> findAllByOrderByGpaDesc();

    List<StudentModel> findAll();
}
