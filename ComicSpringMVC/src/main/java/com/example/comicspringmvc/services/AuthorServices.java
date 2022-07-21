package com.example.comicspringmvc.services;

import com.example.comicspringmvc.models.AuthorComicEntity;
import com.example.comicspringmvc.models.AuthorEntity;
import com.example.comicspringmvc.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

    public List<AuthorEntity> GetAll() {
        return authorRepository.GetAllActive();
    }

    public Optional<AuthorEntity> FindById(Long id) {
        return authorRepository.findById(id);
    }

    public AuthorEntity Insert(String authorName) {
        authorEntity = new AuthorEntity();
        authorEntity.setAuthorName(authorName.trim());
        authorEntity.setCreatedDate(LocalDate.now());
        authorEntity.setCreatedBy(1L);
        return authorRepository.save(authorEntity);
    }

    public AuthorEntity Update(AuthorEntity author) {
        author.setModifiedDate(LocalDate.now());
        author.setModifiedBy(1L);
        return authorRepository.save(author);
    }

    public AuthorEntity Delete(AuthorEntity author) {
        author.setModifiedDate(LocalDate.now());
        author.setModifiedBy(1L);
        author.setStatus(0);
        return authorRepository.save(author);
    }

    public void Delete(Long id) {
        authorRepository.deleteById(id);
    }
}
