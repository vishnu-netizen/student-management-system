package com.example.student_management_backend.repository;

import com.example.student_management_backend.modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepo extends JpaRepository<Student,Integer> {

}
