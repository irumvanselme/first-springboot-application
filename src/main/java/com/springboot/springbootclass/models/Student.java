package com.springboot.springbootclass.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull(message = "Names is required")
    private String names;

    @NotNull(message = "School name is required")
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
