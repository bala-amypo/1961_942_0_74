package com.example.demo.serviceImplement;

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
    @Override
    public StuEnt saveStudent(StuEnt student){
        return studentRepository.save(student);
    }
    public List<StuEnt>getAll(){
        return studentRepository.findAll();
    }
    @Override
    public StuEnt updateByid(Long id, StuEnt st) {
        return studentRepository.save(st);
    }
    @Override
    public Optional<StuEnt> getid(Long id) {
        return studentRepository.findById(id);
    }
    @Override
    public String delete() {
         studentRepository.deleteAll();
         return "Deleted Successfully...!";
    }
}

