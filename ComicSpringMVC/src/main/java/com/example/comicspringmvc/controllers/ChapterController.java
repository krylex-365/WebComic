package com.example.comicspringmvc.controllers;

import com.example.comicspringmvc.util.tempEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ChapterController {

    @RequestMapping(method = RequestMethod.GET, value = {"/chapter"})
    public String comicList (Model model) {
        model.addAttribute("authorname","author1");
        model.addAttribute("page", "chaptersPage");
        return "chapters";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/chapter/add"})
    public String addComic(Model model) {
        return "chapterAdd";
    }

    @RequestMapping(method = RequestMethod.POST, value = {"/chapter/add"})
    public String addComic(@RequestParam("comicId") String comicId, @RequestParam("chapterOrder") String chapterOrder, @RequestParam("chapterName") String chapterName,
                           @RequestParam("orderImage") int[] orderImage, @RequestParam("image") MultipartFile multipartFile, Model model, RedirectAttributes redirectAttributes) {
        System.out.println("xyz");
        return "redirect:/chapter/add";
    }

//    @RequestMapping(method = RequestMethod.GET, value = {"/chapter/edit"})
//    public String editComic(Model model) {
//        model.addAttribute("authorname","author1");
//        return "chapterEdit";
//    }

    @RequestMapping(method = RequestMethod.POST, value = {"/chapter/test"})
    public String test(@RequestBody tempEntity jsonA) {
        System.out.println(jsonA);
        System.out.println("xyz");
        return "redirect:/chapter/add";
    }

}
