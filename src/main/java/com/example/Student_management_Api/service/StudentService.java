package com.example.Student_management_Api.service;

import com.example.Student_management_Api.entity.Courses;
import com.example.Student_management_Api.entity.Student;
import com.example.Student_management_Api.repo.CoursesRepository;
import com.example.Student_management_Api.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Add a student
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    // Update a student
    public Student updateStudent(Long id, Student studentDetails) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            Student existingStudent = student.get();
            existingStudent.setName(studentDetails.getName());
            existingStudent.setAge(studentDetails.getAge());
            existingStudent.setAddress(studentDetails.getAddress());
            existingStudent.setGender(studentDetails.getGender());
            existingStudent.setCourse(studentDetails.getCourse());
            return studentRepository.save(existingStudent);
        }
        return null;
    }

    // Delete a student
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

}