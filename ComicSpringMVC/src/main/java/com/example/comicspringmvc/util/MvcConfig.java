package com.example.comicspringmvc.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        System.out.println("Config runnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
//        registry
//                .addResourceHandler("../chapter/**")
//                .addResourceLocations("/");
//    }

}
