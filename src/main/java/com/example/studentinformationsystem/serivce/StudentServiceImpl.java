package com.example.studentinformationsystem.serivce;

import com.example.studentinformationsystem.model.StudentModel;
import com.example.studentinformationsystem.respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentModel> findAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public StudentModel findByStudentNumber(long studentNumber) {
        return studentRepository.findStudentByNumber(studentNumber);
    }

    @Override
    public StudentModel findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public List<StudentModel> findAllByOrderByGpaDesc() {
        return studentRepository.findAllByOrderByGpaDesc();
    }

    @Override
    public StudentModel saveOrUpdateStudent(StudentModel student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(String id) {
        studentRepository.deleteById(id);
    }


}
