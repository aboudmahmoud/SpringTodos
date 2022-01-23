package com.Aboud.work.MyScendSpring.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepostiy
        extends JpaRepository<Student,Long> {

}
