package com.miu.springmvc.controller;

import com.miu.springmvc.entity.Student;
import com.miu.springmvc.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // handler method to handle list students and return model and view
    @GetMapping("/")
    public String getListOfStudent(Model model){
        model.addAttribute("students", studentService.getAllstudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String creatStudent(Model model){
        Student student = new Student();
        model.addAttribute("student",student);
        return "createStudent";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "editStudent";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model){
        Student existStudent = studentService.getStudentById(id);
        existStudent.setId(id);
        existStudent.setFirst(student.getFirst());
        existStudent.setLastName(student.getLastName());
        existStudent.setEmail(student.getEmail());

        studentService.updateStudent(existStudent);
        return "redirect:/";
    }
}
