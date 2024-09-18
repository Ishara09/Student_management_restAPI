package com.example.Student_management_Api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data  // Lombok for getters and setters (optional)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String address;
    private String gender;
    private String course;
}