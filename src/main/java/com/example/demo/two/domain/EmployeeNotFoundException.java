package com.example.demo.two.domain;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
