package com.springboot.springbootclass.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Marks {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String course;

    @NotNull
    private float totol_marks;

    @NotNull
    private float scored_marks;

    @NotNull
    @ManyToOne
    private Student student;

    public Marks(){}

    public Marks(@NotNull String course, @NotNull float totol_marks, @NotNull float scored_marks, Student student) {
        this.course = course;
        this.totol_marks = totol_marks;
        this.scored_marks = scored_marks;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getTotol_marks() {
        return totol_marks;
    }

    public void setTotol_marks(float totol_marks) {
        this.totol_marks = totol_marks;
    }

    public float getScored_marks() {
        return scored_marks;
    }

    public void setScored_marks(float scored_marks) {
        this.scored_marks = scored_marks;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
