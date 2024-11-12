package com.newdemo.firstapp.Repository;

import com.newdemo.firstapp.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Student_Repo extends JpaRepository<Student, Integer> {

}
