package com.kelaskoding.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelaskoding.models.Employee;
import com.kelaskoding.repositories.EmployeeRepo;

@Service
@Transactional
public class EmployeeService {
    
    @Autowired
    private EmployeeRepo repo;

    public Iterable<Employee> findAll(){
        return repo.findAll();
    }

    public Employee findById(Long id){
        return repo.findById(id).orElse(null);
    }

    public Employee findByName(String name){
        return repo.findEmployeeByName(name);
    }

    public Employee save(Employee employee){
        return repo.save(employee);       
    }

    public boolean deleteById(Long id){
        repo.deleteById(id);
        return true;
    }
}
