package com.example.student_management_backend.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    private String name;    // lowercase ✅
    private String email;   // lowercase ✅
    private String course;

    public Integer getId() {
        return id;
    }




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
       this. course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", Course='" + course + '\'' +
                '}';
    }

    public String getName() {
        return  name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
