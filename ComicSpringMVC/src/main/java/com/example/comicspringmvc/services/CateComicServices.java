package com.example.comicspringmvc.services;

import com.example.comicspringmvc.models.AuthorEntity;
import com.example.comicspringmvc.models.CateComicEntity;
import com.example.comicspringmvc.repositories.CateComicRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CateComicServices {

    @Autowired
    CateComicRepository cateComicRepository;

    public List<CateComicEntity> FindAll() {
        return cateComicRepository.findAll();
    }

    public Optional<CateComicEntity> FindById(Long id) {
        return cateComicRepository.findById(id);
    }

    public CateComicEntity Insert(CateComicEntity cateComic) {return cateComicRepository.save(cateComic);}

    public CateComicEntity Update(CateComicEntity cateComic) {
        return cateComicRepository.save(cateComic);}

    public void Delete(Long id) {
        cateComicRepository.deleteById(id);}
}
