package com.example.comicspringmvc.controllers;

import com.example.comicspringmvc.models.AuthorEntity;
import com.example.comicspringmvc.repositories.AccountRepository;
import com.example.comicspringmvc.services.AuthorServices;
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
import java.util.Optional;

@Controller
public class AuthorController {
    @Autowired
    AuthorServices authorServices;

    AuthorEntity authorEntity;

    @RequestMapping(method = RequestMethod.GET, value = {"/author"})
    public String authorList (Model model) {
        model.addAttribute("authorsList", authorServices.FindAll());
        model.addAttribute("authorPage", "true");
        return "authors";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/author/add"})
    public String addAuthor(Model model) {
        return "authorAdd";
    }

    @RequestMapping(method = RequestMethod.POST, value = {"/author/add"})
    public String addAuthor(@RequestParam String authorName, RedirectAttributes redirectAttributes) {
        System.out.println(authorName);
        try {
            authorServices.Insert(authorName);
            redirectAttributes.addFlashAttribute("success", "Thêm tác giả thành công!");
            return "redirect:/author";
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("fail", e);
            return "redirect:/author";
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/author/edit"})
    public String editAuthor(@RequestParam String authorId, Model model, RedirectAttributes redirectAttributes) {
        Optional<AuthorEntity> author = authorServices.FindById(Long.parseLong(authorId));
        if (author.isPresent()) {
//            System.out.println(author);
            model.addAttribute("author", author.get());
            return "authorEdit";
        }
        redirectAttributes.addFlashAttribute("fail", "Tác giả không tồn tại!");
        return "redirect:/author";
    }

    @RequestMapping(method = RequestMethod.POST, value = {"/author/edit"})
    public String editAuthor(@RequestParam String authorId, String authorName, Model model, RedirectAttributes redirectAttributes) {
        Optional<AuthorEntity> author = authorServices.FindById(Long.parseLong(authorId));
        if (author.isPresent()) {
//            System.out.println(author);
//            model.addAttribute("author", author);
            if (author.get().getAuthorName().equals(authorName.trim())) {
                redirectAttributes.addFlashAttribute("nochange", "Không có thay đổi!");
                return "redirect:/author";
            }
            author.get().setAuthorName(authorName.trim());
            try {
                authorServices.Update(author.get());
                redirectAttributes.addFlashAttribute("success", "Sửa tác giả thành công!");
                return "redirect:/author";
            } catch (Exception e) {
                redirectAttributes.addFlashAttribute("fail", e);
                return "redirect:/author";
            }
        }
        redirectAttributes.addFlashAttribute("fail", "Tác giả không tồn tại!");
        return "redirect:/author";
    }

    @RequestMapping(method = RequestMethod.POST, value = {"/author/delete"})
    public String deleteAuthor(@RequestParam String authorId, Model model, RedirectAttributes redirectAttributes) {
        Optional<AuthorEntity> author = authorServices.FindById(Long.parseLong(authorId));
        if (author.isPresent()) {
//            System.out.println(author);
//            model.addAttribute("author", author.get());
            try {
                authorServices.Delete(Long.parseLong(authorId));
                redirectAttributes.addFlashAttribute("success", "Xóa tác giả thành công!");
                return "redirect:/author";
            } catch (Exception e) {
                redirectAttributes.addFlashAttribute("fail", e);
                return "redirect:/author";
            }
        }
        redirectAttributes.addFlashAttribute("fail", "Tác giả không tồn tại!");
        return "redirect:/author";
    }
}
