package com.springboot.springbootclass.controllers;

import com.springboot.springbootclass.models.Student;
import com.springboot.springbootclass.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> students() {
        return studentRepository.findAll();
    }

    @PostMapping
    public Student create(@RequestBody Student data) {
        return studentRepository.save(data);
    }

    @GetMapping(value = "/{id}")
    public Optional<Student> getBook(@PathVariable("id") long id) {
        return studentRepository.findById(id);
    }

    @PutMapping
    public Student update(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") long id) {
        studentRepository.deleteById(id);
    }
}
