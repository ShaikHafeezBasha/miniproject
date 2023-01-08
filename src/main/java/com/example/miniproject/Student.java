package com.example.miniproject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Student")
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;

    @Column(name="student_name")
    private String name;

    @Column(name="student_age")
    private int age;

    @Column(name="mobile_no")
    private String mbleNo;

    @ManyToOne
    @JsonIgnore
    private Department department;

}
