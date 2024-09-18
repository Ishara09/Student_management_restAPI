package com.example.Student_management_Api.controller;

import com.example.Student_management_Api.entity.Courses;
import com.example.Student_management_Api.entity.Student;
import com.example.Student_management_Api.repo.CoursesRepository;
import com.example.Student_management_Api.service.CourseService;
import com.example.Student_management_Api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;


    @Autowired
    private CourseService courseService;

    // Get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }


    @GetMapping(value = "/courses")
    public List<Courses> getAllCourses() {
        return courseService.getAllCourses();
    }



    // Add a student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    // Update a student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    // Delete a student
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
