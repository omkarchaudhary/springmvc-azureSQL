package com.miu.springmvc;

import com.miu.springmvc.entity.Student;
import com.miu.springmvc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcWithSpringBootApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;
    public static void main(String[] args) {
        SpringApplication.run(SpringMvcWithSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Student student = new Student("Ramesh","Khan","ramesh.khan@gmail.com");
//        studentRepository.save(student);
//
//        student = new Student("Shyam","Pahadi","shyam.pahadi@gmail.com");
//        studentRepository.save(student);
    }
}
