package com.springjpa.springdatajpa.repository;

import com.springjpa.springdatajpa.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository  extends JpaRepository<Teacher,Long> {
}
