package com.springjpa.springdatajpa.repository;

import com.springjpa.springdatajpa.model.Course;
import com.springjpa.springdatajpa.model.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;


   // @Test
    /*public void saveTeacher() {

        Course courseDSA = Course.builder().credit(7).title("DSA").build();
        Course courseJAVA = Course.builder().credit(10).title("JAVA").build();
        Teacher teacher
                = Teacher.builder().
                firstName("Pawan").
                lastName("Kumar").(List.of(courseDSA, courseJAVA)).build();

        teacherRepository.save(teacher);
    }*/
}