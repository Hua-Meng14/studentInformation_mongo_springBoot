package com.example.studentinformationsystem.serivce;

import com.example.studentinformationsystem.model.StudentModel;
import com.example.studentinformationsystem.respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl {


    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //    @Override
    public List<StudentModel> findAllStudent() {
        try {
            return studentRepository.findAll();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error occurred while retrieving students. " + e.getMessage());
        }
    }

    //    @Override
    public StudentModel findByStudentNumber(long studentNumber) {
        try {
            Optional<StudentModel> optionalStudent = Optional.ofNullable(studentRepository.findStudentByStudentNumber(studentNumber));
            if (optionalStudent.isPresent()) {
                return optionalStudent.get();
            } else {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student not found for student number: " + studentNumber);
            }
        } catch (ResponseStatusException e) {
            throw e;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error occurred while retrieving student by student number: " + e);
        }
    }

    //    @Override
    public StudentModel findByEmail(String email) {
        try {
            Optional<StudentModel> optionalStudent = Optional.ofNullable(studentRepository.findByEmail(email));
            if (optionalStudent.isPresent()) {
                return optionalStudent.get();
            } else {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student not found for email: " + email);
            }
        } catch (ResponseStatusException e) {
            throw e;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error occurred while retrieving student by email: " + e);
        }
    }

    //    @Override
    public List<StudentModel> findAllByOrderByGpaDesc() {
        try {
            return studentRepository.findAllByOrderByGpaDesc();

        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Error occurred while retrieving students order by gpa. " +e);
        }
    }

    //    @Override
    public StudentModel saveOrUpdateStudent(StudentModel student) {
        return studentRepository.save(student);
    }

    //    @Override
    public void deleteStudentById(String id) {
        studentRepository.deleteById(id);
    }


}
