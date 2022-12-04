package com.kelaskoding.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.kelaskoding.models.Department;

public interface DepartementRepo extends PagingAndSortingRepository<Department, Long>{
    
}
