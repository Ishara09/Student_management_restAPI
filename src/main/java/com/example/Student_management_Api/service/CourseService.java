package com.example.Student_management_Api.service;

import com.example.Student_management_Api.entity.Courses;
import com.example.Student_management_Api.repo.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CoursesRepository coursesRepository;


    public List<Courses> getAllCourses() {
        return coursesRepository.findAll();
    }
}
