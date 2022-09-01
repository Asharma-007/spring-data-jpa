package com.springjpa.springdatajpa.repository;

import com.springjpa.springdatajpa.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {


}
