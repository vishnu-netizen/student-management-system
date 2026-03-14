package com.example.student_management_backend.Controller;

import com.example.student_management_backend.Service.Studentservice;
import com.example.student_management_backend.modal.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class StudentController {
    @Autowired
    private Studentservice studentservice;
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/students")
    public List<Student> getAllstudents(){
        return studentservice.getAllstudents();
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/students")
    public Student addstudent(@RequestBody Student obj){
        return studentservice.createstudent(obj);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentservice.deleteStudent(id);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable Integer id,@RequestBody Student obj){
        return studentservice.updateStudent(id,obj);
    }

}
