package com.example.studentinformationsystem.respository;

import com.example.studentinformationsystem.model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<StudentModel, String> {
    @Query("{studentNumber:'?0'}")
    StudentModel findStudentByStudentNumber(String studentNumber);

    @Query("{email:'?0'}")
    StudentModel findByEmail(String email);

    List<StudentModel> findAllByOrderByGpaDesc();

//    @Query(value = "{}", fields = "{ 'name' : 0, 'field2' : 0 }") // Specify the fields you want to exclude
    List<StudentModel> findAll();
}
