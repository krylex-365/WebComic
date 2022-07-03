package com.example.comicspringmvc.services;

import com.example.comicspringmvc.models.AuthorComicEntity;
import com.example.comicspringmvc.models.AuthorEntity;
import com.example.comicspringmvc.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServices {

    @Autowired
    AuthorRepository authorRepository;
    AuthorEntity authorEntity;

    public List<AuthorEntity> FindAll() {
        return authorRepository.findAll();
    }

    public Optional<AuthorEntity> FindById(Long id) {
        return authorRepository.findById(id);
    }

    public AuthorEntity Insert(String authorName) {
        authorEntity = new AuthorEntity();
        authorEntity.setAuthorName(authorName.trim());
        return authorRepository.save(authorEntity);
    }

    public AuthorEntity Update(AuthorEntity author) {
        return authorRepository.save(author);
    }

    public void Delete(Long id) {
        authorRepository.deleteById(id);
    }
}
