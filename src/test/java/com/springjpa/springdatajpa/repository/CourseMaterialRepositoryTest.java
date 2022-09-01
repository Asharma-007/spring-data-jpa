package com.springjpa.springdatajpa.repository;

import com.springjpa.springdatajpa.model.Course;
import com.springjpa.springdatajpa.model.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository    courseMaterialRepository;

    @Test
    public void saveCourseMaterial(){
        Course course
                =Course.builder().
                title("Digital Electronics").
                credit(6).build();
        CourseMaterial courseMaterial = CourseMaterial.
                builder().url("www.google.com")
                .course(course).build();



        courseMaterialRepository.save(courseMaterial);
    }

    @Test
    public void printAllCourseMaterial()
    {

        List<CourseMaterial> courseMaterialList = courseMaterialRepository.findAll();
        System.out.println("courseMaterialList :: "+ courseMaterialList);
    }

}