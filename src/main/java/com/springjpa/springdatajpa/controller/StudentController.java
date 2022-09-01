package com.springjpa.springdatajpa.controller;



import com.springjpa.springdatajpa.model.Student;

import com.springjpa.springdatajpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;


    @GetMapping("/students")
    public List<Student> getAllEmployees() {
        return studentRepository.findAll();
    }

    @GetMapping("/test")
    public String testApi() {
        return "Hi it is working";
    }




    @PostMapping("/students")
    public Student createEmployee( @RequestBody Student student) {
        return studentRepository.save(student);
    }




}
