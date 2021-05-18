package com.springboot.springbootclass.models;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String names;

    @NotNull
    private String schoolName;

    @OneToOne
    private Marks marks;

    public Student() { }

    public Student(String names, String schoolName) {
        this.names = names;
        this.schoolName = schoolName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
