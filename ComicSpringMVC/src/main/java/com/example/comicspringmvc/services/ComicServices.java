package com.example.comicspringmvc.services;

import com.example.comicspringmvc.models.ChapterEntity;
import com.example.comicspringmvc.models.ComicEntity;
import com.example.comicspringmvc.repositories.ComicRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ComicServices {

    @Autowired
    ComicRepository ComicRepository;

    public List<ComicEntity> FindAll() {
        return ComicRepository.findAll();
    }

    public Optional<ComicEntity> FindById(Long id) {
        return ComicRepository.findById(id);
    }

    public ComicEntity Insert(ComicEntity comic) {return ComicRepository.save(comic);}

    public ComicEntity Update(ComicEntity comic) {
        return ComicRepository.save(comic);}

    public void Delete(Long id) {
        ComicRepository.deleteById(id);}
}
