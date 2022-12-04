package com.kelaskoding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kelaskoding.models.Department;
import com.kelaskoding.services.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    
    @Autowired
    private DepartmentService departmentService;


    @PostMapping
    public Department createOne(@RequestBody Department department){
        return departmentService.createOne(department);
    }

    @GetMapping
    public Iterable<Department> findAll(){
        return departmentService.findAll();
    }

    @GetMapping("/{page}/{size}")
    public Page<Department> findAll(@PathVariable("page") int page, @PathVariable("size") int size){
        return departmentService.findAll(page, size);
    }
}
