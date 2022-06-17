package com.example.comicspringmvc.services;

import com.example.comicspringmvc.models.AccountEntity;
import com.example.comicspringmvc.repositories.AccountRepository;

import java.util.List;
import java.util.Optional;

public class AccountServices {

    AccountRepository account;

    public List<AccountEntity> FindAll() {
        return account.findAll();
    }

    public Optional<AccountEntity> FindById(Long id) {
        return account.findById(id);
    }

    public AccountEntity Insert(AccountEntity acc) {
        return account.save(acc);
    }

    public AccountEntity Update(AccountEntity acc) {
        return account.save(acc);
    }

    public void Delete(Long id) {
        account.deleteById(id);
    }
}
