package com.kelaskoding.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelaskoding.models.Account;
import com.kelaskoding.models.Department;
import com.kelaskoding.models.Employee;
import com.kelaskoding.repositories.AccountRepo;
import com.kelaskoding.repositories.DepartementRepo;
import com.kelaskoding.repositories.EmployeeRepo;

@Service
@Transactional
public class AccountService {
    
    @Autowired
    private AccountRepo repo;
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private DepartementRepo departementRepo;

    public Account createOne(Account account){
        Department dep = departementRepo.save(account.getEmployee().getDepartement());
        Employee emp = account.getEmployee();
        emp.setDepartement(dep);
        emp = employeeRepo.save(emp);
        account.setEmployee(emp);
        return repo.save(account);
    }

    public Account findById(Long id){
        return repo.findById(id).orElse(null);
    }

}
