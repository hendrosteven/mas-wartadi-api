package com.kelaskoding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kelaskoding.models.Account;
import com.kelaskoding.services.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    
    @Autowired
    private AccountService accountService;

    @PostMapping
    private Account createAccount(@RequestBody Account account){
        return accountService.createOne(account);
    }

    @GetMapping("/{id}")
    private Account findById(@PathVariable("id") Long id){
        return accountService.findById(id);
    }
}
