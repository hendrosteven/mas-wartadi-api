package com.kelaskoding.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kelaskoding.models.Department;
import com.kelaskoding.repositories.DepartementRepo;

@Service
@Transactional
public class DepartmentService {
    
    @Autowired
    private DepartementRepo repo;

    public Department createOne(Department department){
        return repo.save(department);
    }

    public Iterable<Department> findAll(){
        return repo.findAll();
    }

    public Page<Department> findAll(int page, int size){
        return repo.findAll(PageRequest.of(page, size));
    }

    public Department findById(Long id){
        return repo.findById(id).orElse(null);
    }
}
