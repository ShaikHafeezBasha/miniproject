package com.example.miniproject.Service;



import com.example.miniproject.Repository.StudentRepo;
import com.example.miniproject.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;
    public void add_user(Student student) {
        studentRepo.save(student);
    }

    public Student findByName(String name) {
        return studentRepo.findByName(name);
    }

}
