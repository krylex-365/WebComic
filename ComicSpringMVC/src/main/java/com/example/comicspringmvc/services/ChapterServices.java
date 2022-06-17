package com.example.comicspringmvc.services;

import com.example.comicspringmvc.models.ChapterEntity;
import com.example.comicspringmvc.models.ChapterImageEntity;
import com.example.comicspringmvc.repositories.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ChapterServices {

    @Autowired
    ChapterRepository chapterRepository;

    public List<ChapterEntity> FindAll() {
        return chapterRepository.findAll();
    }

    public Optional<ChapterEntity> FindById(Long id) {
        return chapterRepository.findById(id);
    }

    public ChapterEntity Insert(ChapterEntity chapter) {return chapterRepository.save(chapter);}

    public ChapterEntity Update(ChapterEntity chapter) {
        return chapterRepository.save(chapter);}

    public void Delete(Long id) {
        chapterRepository.deleteById(id);}
}
