package com.example.comicspringmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChapterController {

    @RequestMapping(method = RequestMethod.GET, value = {"/chapter"})
    public String comicList (Model model) {
        model.addAttribute("authorname","author1");
        return "chapters";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/chapter/add"})
    public String addComic(Model model) {
        return "chapterAdd";
    }

//    @RequestMapping(method = RequestMethod.GET, value = {"/chapter/edit"})
//    public String editComic(Model model) {
//        model.addAttribute("authorname","author1");
//        return "chapterEdit";
//    }

}
