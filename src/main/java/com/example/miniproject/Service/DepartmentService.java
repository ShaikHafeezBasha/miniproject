package com.example.miniproject.Service;

import com.example.miniproject.Department;
import com.example.miniproject.Repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepo departmentRepo;
    public List<Department> findAll() {
        return (List<Department>) departmentRepo.findAll();
    }

    public Optional<Department> findingById(Integer id) {
        return departmentRepo.findById(id);
    }
}
