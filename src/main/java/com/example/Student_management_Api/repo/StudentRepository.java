package com.example.Student_management_Api.repo;

import com.example.Student_management_Api.entity.Courses;
import com.example.Student_management_Api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {


}
