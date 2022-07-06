package com.example.comicspringmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RoleController {
    @RequestMapping(method = RequestMethod.GET, value = {"/role"})
    public String rolesList (Model model) {
        model.addAttribute("authorname","author1");
        model.addAttribute("page", "rolesPage");
        return "roles";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/role/add"})
    public String roleAdd (Model model) {
        return "roleAdd";
    }
}
