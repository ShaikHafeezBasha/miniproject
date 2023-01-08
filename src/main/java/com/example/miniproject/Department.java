package com.example.miniproject;
import lombok.*;
import java.util.*;
import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="department")
@Entity
public class Department {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="department_name")
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Student>students;






}
