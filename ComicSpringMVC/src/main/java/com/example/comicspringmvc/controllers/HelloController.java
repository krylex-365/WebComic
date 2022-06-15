package com.example.comicspringmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(path = "/hello")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET, value = {"/", "/dangky"})
    public String test(Model model) {
        System.out.println("test ok");
        model.addAttribute("abc", "test123");
        return "test";
    }
}
