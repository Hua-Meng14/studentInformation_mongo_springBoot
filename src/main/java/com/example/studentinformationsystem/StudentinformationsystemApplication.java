package com.example.studentinformationsystem;

import com.example.studentinformationsystem.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
//@ComponentScan(basePackageClasses = StudentRestcController.class)
//@ComponentScan(basePackageClasses = StudentService.class)
//@ComponentScan(basePackages = "com.example.studentinformationsystem.controller")
//@ComponentScan(basePackages = "com.example.studentinformationsystem.service")
//@ComponentScan("com.example")
//@ComponentScan(basePackages = "com.example.studentinformationsystem")
public class StudentinformationsystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudentinformationsystemApplication.class, args);
	}
//
//	@RestController
//	@RequestMapping("/api/students")
//	public static class StudentRestcController {
//
//		@Autowired
//		private  ;
//
//		@GetMapping("/")
//		public List<StudentModel> getAllStudents() {
//			return studentService.findAllStudent();
//		}
//
//		@GetMapping("/{studentNumber}")
//		public StudentModel getStudentByStudentNumber(@PathVariable("studentNumber") long studentNumber) {
//			return studentService.findByStudentNumber(studentNumber);
//		}
//
//		@GetMapping("/email/{email}")
//		public StudentModel getStudentByEmail(@PathVariable("email") String email) {
//			return studentService.findByEmail(email);
//		}
//
//		@GetMapping("/orderByGpa")
//		public List<StudentModel> findAllByOrderByGpaDesc() {
//			return studentService.findAllByOrderByGpaDesc();
//		}
//
//		@PostMapping("/")
//		public ResponseEntity<?> saveOrUpdateStudent(@RequestBody StudentModel studentModel) {
//			studentService.saveOrUpdateStudent(studentModel);
//			return new ResponseEntity("Student added succesfully", HttpStatus.OK);
//		}
//
//		@DeleteMapping("/{studentNumber}")
//		public ResponseEntity<?> deleteStudentByStudentNumber(@PathVariable("studentNumber") long studentNumber) {
//			studentService.deleteStudentById(studentService.findByStudentNumber(studentNumber).getId());
//			return new ResponseEntity("Student deleted succesfully", HttpStatus.OK);
//		}
//	}
}
