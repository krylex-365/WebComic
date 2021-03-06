package com.example.comicspringmvc.controllers;

import com.example.comicspringmvc.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.websocket.server.PathParam;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Controller
//@RequestMapping(path = "/hello")
public class HelloController {
    @Autowired
    AccountRepository accountRepository;

    @RequestMapping(method = RequestMethod.GET, value = {"/", "/dashboard"})
    public String test(Model model) {
//        if (accountRepository.findAll().isEmpty()) {
//            PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//            LocalDate a = LocalDate.of (2022,12,12);
//            AccountEntity newAcc = new AccountEntity("mail@123", passwordEncoder.encode("123456"), a, "Duong Kiet", a, 1, 1, 1, null);
//        }

        System.out.println("test ok");

        //System.out.println(accountRepository.TEMP());
//        model.addAttribute("abc", "test123");
//        model.addAttribute("url", "image.jpg");
        return "index";
    }

    @RequestMapping("/resource")


    @GetMapping("/user")
    public String user(Model model) {
        return "<h1>User</h1>";
    }

    @GetMapping("/temp")
    public String admin(Authentication authentication, Model model) {
        //model.addAttribute("principal", authentication.getPrincipal());
        return "test";
    }

    @PostMapping("/upload/image/{mangaid}/{chapter}")
    public String saveUser(@PathVariable("mangaid") int mangaid, @PathVariable("chapter") String chapter, @RequestParam("image") MultipartFile[] multipartFile, RedirectAttributes redirectAttributes) throws IOException {


        if(mangaid==1){ // check th??m id manga c?? ph???i thu???c v??? user n??y hay kh??ng // check th??m lu??n truy???n n??y c?? trong db kh??ng
            String uploadDir = "src/main/resources/static/manga/chapter/1/";
            File theDir = new File(uploadDir);
            if (!theDir.exists()){
                System.out.println("exist");
                theDir.mkdirs();
            }

            for(int i = 0; i < multipartFile.length;i ++){
                String fileName = i + ".jpg";
                byte[] bytes = multipartFile[i].getBytes();
                String insPath = uploadDir + fileName;
                Files.write(Paths.get(insPath),bytes);
            }


        }else{

        }
        String uploadDir = "manga/";

//        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);

        return "redirect:/dangky";
    }
}
