package com.springboot.springbootclass.controllers;

import com.springboot.springbootclass.models.Student;
import com.springboot.springbootclass.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping
    public List<Student> students (){
        return  repository.findAll();
    }

    @PostMapping
    public Student create(@Valid @RequestBody Student student){
        return repository.save(student);
    }

    @GetMapping(value = "/{name}")
    public Student getStudentsByNames(String name){
        return repository.findByNames(name);
    }

    @PutMapping
    public Student update(@RequestBody Student student){
        return repository.save(student);
    }
}
