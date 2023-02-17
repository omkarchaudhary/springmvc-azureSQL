package com.miu.springmvc.service;

import com.miu.springmvc.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllstudents();
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    Student getStudentById(Long id);
}
