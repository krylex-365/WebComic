package com.example.comicspringmvc.services;

import com.example.comicspringmvc.models.AccountEntity;
import com.example.comicspringmvc.models.AuthorComicEntity;
import com.example.comicspringmvc.models.AuthorEntity;
import com.example.comicspringmvc.repositories.AuthorComicRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AuthorComicServices {

    @Autowired
    AuthorComicRepository authorComicRepository;

    public List<AuthorComicEntity> FindAll() {
        return authorComicRepository.findAll();
    }

    public Optional<AuthorComicEntity> FindById(Long id) {
        return authorComicRepository.findById(id);
    }

    public AuthorComicEntity Insert(AuthorComicEntity authorComic) {return authorComicRepository.save(authorComic);}

    public AuthorComicEntity Update(AuthorComicEntity congViec) {
        return authorComicRepository.save(congViec);}

    public void Delete(Long id) {authorComicRepository.deleteById(id);}
}
