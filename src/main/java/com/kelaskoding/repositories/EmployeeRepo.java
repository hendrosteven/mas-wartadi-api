package com.kelaskoding.repositories;

import org.springframework.data.repository.CrudRepository;

import com.kelaskoding.models.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Long>{
    
    

}
