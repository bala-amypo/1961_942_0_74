package com.example.PracticeProject.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.PracticeProject.entity.StuEnt;
import com.example.PracticeProject.service.StudentService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/postdata")
    public StuEnt postdata(@RequestBody StuEnt student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/get")
    public List<StuEnt> getData(){
        return StudentService.getAll();
    }
    @GetMapping("/get{id}")
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