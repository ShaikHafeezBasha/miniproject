package com.example.miniproject.Controller;

import com.example.miniproject.Department;
import com.example.miniproject.Repository.DepartmentRepo;
import com.example.miniproject.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    //getting list of departments
    @GetMapping("/AllDepartments")
    public List<Department>findAll(){
        return departmentService.findAll();
    }

    //getting department by id
    @GetMapping("/department/{id}")
    public Optional<Department>findingById(@PathVariable("id") Integer id){
        return departmentService.findingById(id);
    }
}
