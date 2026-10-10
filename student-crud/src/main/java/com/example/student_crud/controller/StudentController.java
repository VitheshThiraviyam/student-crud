package com.example.student_crud.controller;

import com.example.student_crud.model.Student;
import com.example.student_crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }

    @PostMapping("/addStudents")
    public String addStudents(@RequestBody Student student)
    {
        studentService.addStudents(student);
        return "Student added";
    }
    @GetMapping("/student/{rn}")
    public Student getStudentByRollno(@PathVariable("rn") int rn)
    {
        return studentService.getStudentByRollno(rn);

    }
}
