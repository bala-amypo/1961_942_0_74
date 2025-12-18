package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StuEnt;
import com.example.demo.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/postdata")
    public StuEnt postdata(@RequestBody StuEnt student) {
        //TODO: process POST request
        return studentService.saveStudent(student);
    }
    
}
