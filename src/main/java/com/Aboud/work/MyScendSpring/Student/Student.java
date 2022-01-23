package com.Aboud.work.MyScendSpring.Student;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName="student_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"

    )
    private Long id ;
    private String name;
    private String email;
    private LocalDate dop;
    @Transient
    private int age ;

    public Student() {
    }

    public Student(Long id, String name, String email, LocalDate dop) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dop = dop;
        //this.age = age;
    }

    public Student(String name, String email, LocalDate dop) {
        this.name = name;
        this.email = email;
        this.dop = dop;
       // this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDop() {
        return dop;
    }

    public void setDop(LocalDate dop) {
        this.dop = dop;
    }

    public int getAge() {
        return Period.between(this.dop,LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dop=" + dop +
                ", age=" + age +
                '}';
    }
}
