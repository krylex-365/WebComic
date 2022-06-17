package com.example.comicspringmvc.controllers;

import com.example.comicspringmvc.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(path = "/hello")
public class HelloController {
    @Autowired
    AccountRepository accountRepository;

    @RequestMapping(method = RequestMethod.GET, value = {"/", "/dangky"})
    public String test(Model model) {
//        if (accountRepository.findAll().isEmpty()) {
//            PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//            LocalDate a = LocalDate.of (2022,12,12);
//            AccountEntity newAcc = new AccountEntity("mail@123", passwordEncoder.encode("123456"), a, "Duong Kiet", a, 1, 1, 1, null);
//        }

        System.out.println("test ok");
        model.addAttribute("abc", "test123");
        return "test";
    }

    @GetMapping("/user")
    public String user(Model model) {
        return "<h1>User</h1>";
    }

    @GetMapping("/admin")
    public String admin(Authentication authentication, Model model) {
        model.addAttribute("principal", authentication.getPrincipal());
        return "admin";
    }
}
