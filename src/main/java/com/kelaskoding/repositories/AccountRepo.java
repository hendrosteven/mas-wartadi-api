package com.kelaskoding.repositories;

import org.springframework.data.repository.CrudRepository;

import com.kelaskoding.models.Account;

public interface AccountRepo extends CrudRepository<Account, Long> {
    
}
