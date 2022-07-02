package com.example.comicspringmvc.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        String classpath = System.getProperty("java.class.path");
//        System.out.println("classpath: "+classpath);
        System.out.println("");
        registry.addResourceHandler("/chapter/*.jpg").addResourceLocations("file:src/main/resources/static/");
        registry.addResourceHandler("/chapter/*/*.jpg").addResourceLocations("file:src/main/resources/static/");
        registry.addResourceHandler("/res/**").addResourceLocations("file:src/main/webapp/views/");
//        registry.addResourceHandler("/chapter/*/*.jpg").addResourceLocations("classpath:/static/");


    }

}
