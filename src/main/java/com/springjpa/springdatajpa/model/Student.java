package com.springjpa.springdatajpa.model;


import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "students")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
    public class Student {

        @Id
        @SequenceGenerator(
                name = "student_sequence",
                sequenceName = "student_sequence",
                allocationSize = 1
        )
        @GeneratedValue(
                strategy = GenerationType.SEQUENCE,
                generator = "student_sequence"
        )
        private Long studentId;
        private String firstName;
        private String lastName;

        @Column(
                name = "email_address",
                nullable = false
        )
        private String emailId;

        @Embedded
        private Gurdian guardian;



}
