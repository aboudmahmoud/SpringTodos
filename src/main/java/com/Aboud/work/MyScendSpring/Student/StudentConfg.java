package com.Aboud.work.MyScendSpring.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfg {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepostiy repostiy)  {
        return  args -> {
           Student Aboud= new Student(

                   "aboud","aboudmahmoud40@gmail", LocalDate.of(1998, JULY,14)

            );

            Student alex= new Student(

                    "alex","alex@gmail", LocalDate.of(2008, JUNE,14)

            );
            repostiy.saveAll(List.of(Aboud,alex));
        };
    }
}
