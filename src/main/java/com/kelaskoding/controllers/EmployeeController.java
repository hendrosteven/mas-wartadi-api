package com.kelaskoding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kelaskoding.models.Employee;
import com.kelaskoding.services.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public Iterable<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    public Employee findOne(@PathVariable("id") Long id){
        return employeeService.findById(id);
    }

    @GetMapping("/name/{name}")
    public Employee findOneByName(@PathVariable("name") String name){
        return employeeService.findByName(name);
    }

    @PostMapping
    public Employee createOne(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable("id") Long id){
        return employeeService.deleteById(id);
    }
}
