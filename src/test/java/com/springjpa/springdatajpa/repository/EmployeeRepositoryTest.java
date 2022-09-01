package com.springjpa.springdatajpa.repository;


import com.springjpa.springdatajpa.model.Gurdian;
import com.springjpa.springdatajpa.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;


@SpringBootTest
public class EmployeeRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;


    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .emailId("shabbir@gmail.com")
                .firstName("Shabbir")
                .lastName("Dawoodi")
                //.guardianName("Nikhil")
                //.guardianEmail("nikhil@gmail.com")
                //.guardianMobile("9999999999")
                .build();

        studentRepository.save(student);
    }
    @Test
    public void saveStudentWithGuardian() {

        Gurdian guardian = Gurdian.builder()
                .email("nikhil@gmail.com")
                .name("Nikhil")
                .mobile("9999956324")
                .build();

        Student student = Student.builder()
                .firstName("Shivam")
                .emailId("shivam@gmail.com")
                .lastName("Kumar")
                .guardian(guardian)
                .build();

        studentRepository.save(student);

    }
    @Test
    public void printAllEmployees(){
        List<Student> allEmployees = studentRepository.findAll();
        System.out.println("allEmployees " + allEmployees);
    }

    @Test
    public void printByFirstName(){
        List<Student> students = studentRepository.findByFirstName("Aakash");
        System.out.println("students " + students);
    }

    @Test
    public void printByFirstNameAndLastName(){
        List<Student> students = studentRepository.findStudentByfirstNameAndLastName("Aakash" , "Kumar");
        System.out.println("printByFirstNameAndLastName " + students);
    }

   @Test
    public void printStudentByEmail() {

       String firstName = studentRepository.getStudentFirstNameByEmailAddress("aakashs317@gmail.com");

       System.out.println("students = " + firstName);
    }


    @Test
    public void printStudentByEmailUsingNativeQuery() {

        Student studentByEmailAddress = studentRepository.getStudentyEmailAddress("shivam@gmail.com");

        System.out.println("studentByEmailAddress = " + studentByEmailAddress);
    }

    @Test
    public void printStudentByEmailByParams() {

        Student studentByEmailAddress = studentRepository.getStudentByEmailIDUsingParam("shivam@gmail.com");

        System.out.println("studentByEmailAddress = " + studentByEmailAddress);
    }

    @Test
    public void updateNameByEmail(){
        studentRepository.updateStudentNameByEmailId("Anish", "aakashs317@gmail.com");

    }
}