package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StuEnt;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImplement implements StudentService{
    // private final StudentRepository studentRepository;
    // public StudentServiceImplement(StudentRepository studentRepository){
    //     this.studentRepository=studentRepository;
    // }
    @Autowired
    StudentRepository studentRepository;

    public StuEnt saveStudent(StuEnt student){
        return studentRepository.save(student);
    }
}
