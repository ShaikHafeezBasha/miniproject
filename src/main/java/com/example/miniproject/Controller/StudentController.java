package com.example.miniproject.Controller;


import com.example.miniproject.Service.StudentService;
import com.example.miniproject.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add_user")
    public void createUser(@RequestBody Student student) {
        studentService.add_user(student);
    }

    @GetMapping("/student/{name}")
    public Student getByName(@PathVariable("name") String name) {
        return studentService.findByName(name);
    }
}



