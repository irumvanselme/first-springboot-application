package com.springboot.springbootclass.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateStudentDTO {
    @NotNull
    @Size(min = 2, max = 10)
    private String names;

    @NotNull
    @Size(min = 2, max = 10)
    private String schoolName;

    @NotNull
    @Size(min = 2, max = 10)
    private String course;

    @NotNull
    private float total_marks;

    @NotNull
    private float scored_marks;

    public CreateStudentDTO() {
    }

    public CreateStudentDTO(@NotNull @Size(min = 2, max = 10) String names, @NotNull @Size(min = 2, max = 10) String schoolName, @NotNull @Size(min = 2, max = 10) String course, @NotNull float total_marks, @NotNull float scored_marks) {
        this.names = names;
        this.schoolName = schoolName;
        this.course = course;
        this.total_marks = total_marks;
        this.scored_marks = scored_marks;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getTotal_marks() {
        return total_marks;
    }

    public void setTotal_marks(float total_marks) {
        this.total_marks = total_marks;
    }

    public float getScored_marks() {
        return scored_marks;
    }

    public void setScored_marks(float scored_marks) {
        this.scored_marks = scored_marks;
    }
}
