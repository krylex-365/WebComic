package com.example.comicspringmvc.controllers;

import com.example.comicspringmvc.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Controller
public class AuthorController {

    @RequestMapping(method = RequestMethod.GET, value = {"/author"})
    public String authorList (Model model) {
        model.addAttribute("authorname","author1");
        model.addAttribute("authorPage", "true");
        return "authors";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/author/add"})
    public String addAuthor(Model model) {
        return "authorAdd";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/author/edit"})
    public String editAuthor(Model model) {
        model.addAttribute("authorname","author1");
        return "authorEdit";
    }

}
