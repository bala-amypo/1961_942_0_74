package com.example.demo.repository;

import org.springframe.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Student;

public interface StudentRepository extends JpaRepository<StudentEntity,Long>{
    
}