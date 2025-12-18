package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.StuEnt;

@Service
public interface StudentService {
    StuEnt saveStudent(StuEnt student);
}