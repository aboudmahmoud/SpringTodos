package com.Aboud.work.MyScendSpring.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {

    private final StudentServis studentseris;

    @Autowired
    public StudentController(StudentServis studentseris) {
        this.studentseris = studentseris;
    }

    @GetMapping
    public List<Student> getSudents()
    {
        return studentseris.getSudents();

    }
    @PostMapping
    public void newStudnet(@RequestBody Student student)
    {
        studentseris.addNewStudsnt(student);

    }

}
