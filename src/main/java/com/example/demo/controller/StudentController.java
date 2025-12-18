package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StuEnt;
import com.example.demo.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/postdata")
    public StuEnt postdata(@RequestBody StuEnt student) {
        //TODO: process POST request
        return studentService.saveStudent(student);
    }
     @GetMapping("/get")
    public List<StuEnt> getData(){
        return studentService.getAll();
    }
    @GetMapping("/get/{id}")
    public Optional<StuEnt>getById(@PathVariable Long id){
        return studentService.getid(id);
    }

    @PutMapping("/update/{id}")
    public StuEnt update(@PathVariable Long id,@RequestBody StuEnt st){
        return studentService.updateByid(id,st);
    }

    @DeleteMapping("/delete")
    public String delete(){
        return studentService.delete();
    }

}
