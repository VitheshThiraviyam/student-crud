package com.example.student_crud.service;

import com.example.student_crud.model.Student;
import com.example.student_crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public List<Student> getAllStudents()
    {
        return studentRepository.findAll();
    }

    public void addStudents(Student student) {
        studentRepository.save(student);
    }
    public Student getStudentByRollno(int rn)
    {
        return studentRepository.findById(rn).orElse(new Student());
    }
}
