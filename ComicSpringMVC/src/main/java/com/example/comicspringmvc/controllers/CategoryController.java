package com.example.comicspringmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CategoryController {

    @RequestMapping(method = RequestMethod.GET, value = {"/category"})
    public String categoryList (Model model) {
        model.addAttribute("authorname","author1");
        model.addAttribute("alert",false);
        model.addAttribute("categoryPage", "true");
        return "categories";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/category/add"})
    public String addCategory(Model model) {
        return "categoryAdd";
    }

    @RequestMapping(method = RequestMethod.POST, value = {"/category/add"})
    public String add(RedirectAttributes redirectAttributes, @RequestParam("categoryName") String category) {
        System.out.println("Tên thể loại:"+category);
        if(1==1){
            redirectAttributes.addFlashAttribute("success","add success");
        }else{
            redirectAttributes.addFlashAttribute("error","add failed");
        }
        return "redirect:/category";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/category/edit"})
    public String editCategory(Model model) {
        model.addAttribute("authorname","author1");
        return "categoryEdit";
    }

}
