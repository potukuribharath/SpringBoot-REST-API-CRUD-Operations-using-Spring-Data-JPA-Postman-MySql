package com.newdemo.firstapp.controller;

import com.newdemo.firstapp.Repository.Student_Repo;
import com.newdemo.firstapp.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class Studentcontroller {
    @Autowired
    Student_Repo student_Repo;
    @GetMapping("/student")
    public List<Student> getAllStudents() {
        List<Student> student=student_Repo.findAll();

        return student;
    }
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id) {
        Student students=student_Repo.findById(id).get();
        return students;
    }
    @PostMapping("/student/add")
    // Respomsestatus will shown in postman 201 ok it means created
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addStudent(@RequestBody Student student) {

        student_Repo.save(student);

    }

    @PutMapping("/student/update/{id}")
    public Student updateStudent(@PathVariable int id) {


        Student student= student_Repo.findById(id).get();
        student.setName("Teju");
        student.setBranch("MCA");
        student_Repo.save(student);

        return student;

    }
    @DeleteMapping("/student/delete/{id}")
    public void deleteStudent(@PathVariable int id) {
        student_Repo.deleteById(id);
    }



}
