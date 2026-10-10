package com.example.student_crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private int rollno;
    private String name;
    private int age;
    private int department;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public int getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public Student(int rollno, String name, int age, int department) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public Student() {
    }
}
