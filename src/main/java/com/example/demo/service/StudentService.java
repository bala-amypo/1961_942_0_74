package com.example.PracticeProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.PracticeProject.entity.StuEnt;

@Service
public interface StudentService {
    StuEnt saveStudent(StuEnt student);

    static List<StuEnt> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    StuEnt updateByid(Long id, StuEnt st);

    Optional<StuEnt> getid(Long id);

    String delete();
}