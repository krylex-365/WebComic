package com.example.comicspringmvc;

import com.example.comicspringmvc.models.AccountEntity;
import com.example.comicspringmvc.repositories.AccountRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
//@EnableJpaRepositories(basePackageClasses = AccountRepository.class)
public class ComicSpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComicSpringMvcApplication.class, args);

        BCryptPasswordEncoder a = new BCryptPasswordEncoder();
        String encoded = a.encode("admin");
        System.out.println(encoded);
    }

}
