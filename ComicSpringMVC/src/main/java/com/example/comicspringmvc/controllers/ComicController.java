package com.example.comicspringmvc.controllers;

import com.example.comicspringmvc.models.ComicEntity;
import com.example.comicspringmvc.services.CategoryServices;
import com.example.comicspringmvc.services.ComicServices;
import com.example.comicspringmvc.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ComicController {

    @Autowired
    ComicServices comicServices;

    @Autowired
    CategoryServices categoryServices;

    @Autowired
    Utils util;

    String DEFAULT_PATH="src/main/resources/static/manga/";
    @RequestMapping(method = RequestMethod.GET, value = {"/comic"})
    public String comicList (Model model) {
        model.addAttribute("authorname","author1");
        model.addAttribute("page", "comicsPage");
        return "comics";
    }

    @RequestMapping(method = RequestMethod.POST, value = {"/comic/add"})
    public String addComic(Model model, RedirectAttributes redirectAttributes, @RequestParam String comicName, @RequestParam MultipartFile thumnail, @RequestParam String description) {
        ComicEntity result = comicServices.Insert(new ComicEntity(comicName,description));
        if(result != null){
            String thumnailPath = DEFAULT_PATH+result.getComicId();
            if(util.createDir(thumnailPath)){
                util.insertFile(thumnailPath,thumnail,"thumnail.jpg");
            }
            redirectAttributes.addFlashAttribute("success","Thêm truyện mới thành công");
        }else{
            redirectAttributes.addFlashAttribute("fail","Thêm truyện thất bại");
        }

        return "redirect:comics";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/comic/add"})
    public String addComic(Model model) {
        model.addAttribute("category",categoryServices.GetAll());
        return "comicAdd";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/comic/edit"})
    public String editComic(Model model) {
        model.addAttribute("authorname","author1");
        return "comicEdit";
    }

}
