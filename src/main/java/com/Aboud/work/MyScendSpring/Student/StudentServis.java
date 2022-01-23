package com.Aboud.work.MyScendSpring.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentServis {

    private final StudentRepostiy studentRepostiy ;

    @Autowired
    public StudentServis(StudentRepostiy studentRepostiy) {
        this.studentRepostiy = studentRepostiy;
    }

    public  void addNewStudsnt(Student student) {
        System.out.println(student);



    }

    public List<Student> getSudents()
    {
        return studentRepostiy.findAll();
    }
}
