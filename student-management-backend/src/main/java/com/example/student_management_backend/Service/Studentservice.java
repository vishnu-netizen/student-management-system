package com.example.student_management_backend.Service;

import com.example.student_management_backend.modal.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.student_management_backend.repository.Studentrepo;

import java.util.List;

@Service
public class Studentservice {
    @Autowired
    private Studentrepo studentrepo;

    public List<Student> getAllstudents() {
        System.out.println(studentrepo.findAll());
        return studentrepo.findAll();
    }

    public Student createstudent(Student obj) {
        return studentrepo.save(obj);
    }

    public void deleteStudent(Integer id) {
        studentrepo.deleteById(id);
    }

    public Student updateStudent(Integer id, Student student){
        Student existing = studentrepo.findById(id).get();
        existing.setName(student.getName());
        existing.setEmail(student.getEmail());
        existing.setCourse(student.getCourse());
        return studentrepo.save(existing);
    }
}
