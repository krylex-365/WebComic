package com.example.comicspringmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CategoryController {

    @RequestMapping(method = RequestMethod.GET, value = {"/category"})
    public String categoryList (Model model) {
        model.addAttribute("authorname","author1");
        return "categories";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/category/add"})
    public String addCategory(Model model) {
        return "categoryAdd";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/category/edit"})
    public String editCategory(Model model) {
        model.addAttribute("authorname","author1");
        return "categoryEdit";
    }

}
