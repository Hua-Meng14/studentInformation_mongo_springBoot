package com.example.studentinformationsystem.exception;

public class DuplicateStudentNumberException extends RuntimeException{
    public DuplicateStudentNumberException(String message){
        super(message);
    }
}
