package com.example.comicspringmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ComicSpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComicSpringMvcApplication.class, args);

        BCryptPasswordEncoder a = new BCryptPasswordEncoder();
        String encoded = a.encode("admin");
        System.out.println(encoded);
    }

}
