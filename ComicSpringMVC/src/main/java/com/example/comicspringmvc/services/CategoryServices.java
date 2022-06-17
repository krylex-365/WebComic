package com.example.comicspringmvc.services;

import com.example.comicspringmvc.models.CateComicEntity;
import com.example.comicspringmvc.models.CategoryEntity;
import com.example.comicspringmvc.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CategoryServices {

    @Autowired
    CategoryRepository categoryRepository;

    public List<CategoryEntity> FindAll() {
        return categoryRepository.findAll();
    }

    public Optional<CategoryEntity> FindById(Long id) {
        return categoryRepository.findById(id);
    }

    public CategoryEntity Insert(CategoryEntity categoryComic) {return categoryRepository.save(categoryComic);}

    public CategoryEntity Update(CategoryEntity categoryComic) {
        return categoryRepository.save(categoryComic);}

    public void Delete(Long id) {
        categoryRepository.deleteById(id);}
}
