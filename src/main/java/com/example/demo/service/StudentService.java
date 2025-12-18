package com.example.demo.service;

import com.example.demo.entity.StuEnt;
import java.util.List;
import java.util.Optional;

public interface StudentService {
    StuEnt saveStudent(StuEnt student);
    List<StuEnt> getAll(); 
    Optional<StuEnt> getid(Long id);
    StuEnt updateByid(Long id, StuEnt st);
    String delete();
}