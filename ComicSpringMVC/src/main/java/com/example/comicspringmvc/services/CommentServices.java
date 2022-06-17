package com.example.comicspringmvc.services;

import com.example.comicspringmvc.models.ComicEntity;
import com.example.comicspringmvc.models.CommentEntity;
import com.example.comicspringmvc.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CommentServices {

    @Autowired
    CommentRepository CommentRepository;

    public List<CommentEntity> FindAll() {
        return CommentRepository.findAll();
    }

    public Optional<CommentEntity> FindById(Long id) {
        return CommentRepository.findById(id);
    }

    public CommentEntity Insert(CommentEntity comment) {return CommentRepository.save(comment);}

    public CommentEntity Update(CommentEntity comment) {
        return CommentRepository.save(comment);}

    public void Delete(Long id) {
        CommentRepository.deleteById(id);}
}
