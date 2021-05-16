package com.springboot.springbootclass.repository;

import com.springboot.springbootclass.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    public Student findByNames(String names);
}
