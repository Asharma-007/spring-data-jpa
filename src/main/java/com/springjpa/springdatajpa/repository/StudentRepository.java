package com.springjpa.springdatajpa.repository;


import com.springjpa.springdatajpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    List<Student> findByFirstName(String firstName);
    List<Student> findStudentByfirstNameAndLastName(String firstName, String lastName);


    @Query("select s.firstName from Student s where s.emailId = ?1")
    String getStudentFirstNameByEmailAddress(String emailId);


    @Query(value = "select * from schooldb.students where email_address=?1", nativeQuery = true)
    Student getStudentyEmailAddress(String emailId);


    //Native with params
    @Query(
            value = "SELECT * FROM students s where s.email_address = :emailId",
            nativeQuery = true
    )
    Student getStudentByEmailIDUsingParam(@Param("emailId") String emailId);


    // Modifying data
    @Modifying
    @Transactional
    @Query(
            value = "update students set first_name = ?1 where email_address = ?2",
            nativeQuery = true
    )
    int updateStudentNameByEmailId(String firstName, String emailId);
}
