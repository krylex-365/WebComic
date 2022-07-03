package com.example.comicspringmvc.controllers;

import com.example.comicspringmvc.models.CategoryEntity;
import com.example.comicspringmvc.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class CategoryController {

    @Autowired
    CategoryServices categoryServices;

    @RequestMapping(method = RequestMethod.GET, value = {"/category"})
    public String categoryList (Model model) {
        List<CategoryEntity> categories = categoryServices.FindAll();
        model.addAttribute("categories",categories);
        return "categories";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/category/add"})
    public String addCategory(Model model) {
        return "categoryAdd";
    }

    @RequestMapping(method = RequestMethod.POST, value = {"/category/add"})
    public String add(RedirectAttributes redirectAttributes, @RequestParam("categoryName") String category,@RequestParam("desscription") String desscription) {

        if(categoryServices.Insert(new CategoryEntity(category,desscription))!=null){
            redirectAttributes.addFlashAttribute("success","add success");
        }else{
            redirectAttributes.addFlashAttribute("error","add failed");
        }
        return "redirect:/category";
    }

    @RequestMapping(method = RequestMethod.POST, value = {"/category/delete"})
    public String delete(Model model,RedirectAttributes redirectAttributes, @RequestParam("id") long id) {
        Optional<CategoryEntity> cate = categoryServices.FindById(id);
        if(cate.isPresent()){
            CategoryEntity temp = cate.get();
            categoryServices.Delete(id);
            if(categoryServices.FindById(id).isPresent()){
                redirectAttributes.addFlashAttribute("error","Delete Failed");
            }else{
                redirectAttributes.addFlashAttribute("success","Delete Success");
            }
            return "redirect:/category";
        }
        redirectAttributes.addFlashAttribute("error","Not Found");
        return "redirect:/category";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/category/edit"})
    public String editCategory(Model model, @RequestParam("id") Long id) {
        System.out.println(id);
        Optional<CategoryEntity> cate = categoryServices.FindById(id);
        if(cate.isPresent()){
            CategoryEntity category = cate.get();
            model.addAttribute("category",category);
            return "categoryEdit";
        }
        return "categoryEdit";
    }

    @RequestMapping(method = RequestMethod.POST, value = {"/category/edit"})
    public String edit(RedirectAttributes redirectAttributes, @RequestParam("categoryId") Long id, @RequestParam("categoryName") String category,@RequestParam("desscription") String desscription) {
        Optional<CategoryEntity> cate = categoryServices.FindById(id);
        cate.get().setCategoryName(category);
        cate.get().setDescriptions(desscription);
        if(categoryServices.Update(cate.get())!=null){
            redirectAttributes.addFlashAttribute("success","Edit Success");
        }else{
            redirectAttributes.addFlashAttribute("error","Edit Failed");
        }
        return "redirect:/category";
    }



}
