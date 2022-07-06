package com.example.comicspringmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ComicController {

    @RequestMapping(method = RequestMethod.GET, value = {"/comic"})
    public String comicList (Model model) {
        model.addAttribute("authorname","author1");
        model.addAttribute("page", "comicsPage");
        return "comics";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/comic/add"})
    public String addComic(Model model) {
        return "comicAdd";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/comic/edit"})
    public String editComic(Model model) {
        model.addAttribute("authorname","author1");
        return "comicEdit";
    }

}
