package com.example.miniproject.Repository;

import com.example.miniproject.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
    Student findByName(String name);
}
