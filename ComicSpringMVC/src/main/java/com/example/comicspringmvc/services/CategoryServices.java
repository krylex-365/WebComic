package com.example.comicspringmvc.services;

import com.example.comicspringmvc.models.CateComicEntity;
import com.example.comicspringmvc.models.CategoryEntity;
import com.example.comicspringmvc.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServices {

    @Autowired
    CategoryRepository categoryRepository;

    public void repositoryIsNull(){
        if(categoryRepository==null){
            System.out.println("NULL");
        }else{
            System.out.println("NOT NULL");
        }
    }

    public boolean checkIdIsPresent(Long id){
        if(categoryRepository.findById(id)!=null){
            return true;
        }
        return false;
    }
    public List<CategoryEntity> GetAll() {
        return categoryRepository.GetAllCustom();
    }

    public List<CategoryEntity> FindAll() {
        return categoryRepository.findAll();
    }

    public Optional<CategoryEntity> FindById(Long id) {
        return categoryRepository.findById(id);
    }

    public CategoryEntity Insert(CategoryEntity categoryComic) {return categoryRepository.save(categoryComic);}

    public CategoryEntity Update(CategoryEntity categoryComic) {
        return categoryRepository.save(categoryComic);}

    public boolean Delete(Long id) {
        categoryRepository.deleteById(id);
        if(checkIdIsPresent(id))return false;
        return true;
    }


}
