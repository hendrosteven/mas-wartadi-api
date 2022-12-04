package com.kelaskoding.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.kelaskoding.models.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Long>{
    
    
    @Query("SELECT e FROM Employee e WHERE e.nama = ?1")
    Employee findEmployeeByName(String name);

}
