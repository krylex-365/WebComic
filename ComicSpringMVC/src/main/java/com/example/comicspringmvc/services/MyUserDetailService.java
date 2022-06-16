package com.example.comicspringmvc.services;

import com.example.comicspringmvc.models.AccountEntity;
import com.example.comicspringmvc.repositories.AccountRepository;
import com.example.comicspringmvc.util.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AccountEntity account = accountRepository.findByUsername(username);

        if(account==null){
            throw new UsernameNotFoundException("Couldn't find username");
        }

        return new MyUserDetails(account);
    }
}
