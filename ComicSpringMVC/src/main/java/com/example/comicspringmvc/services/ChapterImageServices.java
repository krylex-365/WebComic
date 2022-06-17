package com.example.comicspringmvc.services;

import com.example.comicspringmvc.models.CategoryEntity;
import com.example.comicspringmvc.models.ChapterImageEntity;
import com.example.comicspringmvc.repositories.ChapterImageRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ChapterImageServices {

    @Autowired
    ChapterImageRepository chapterImageRepository;

    public List<ChapterImageEntity> FindAll() {
        return chapterImageRepository.findAll();
    }

    public Optional<ChapterImageEntity> FindById(Long id) {
        return chapterImageRepository.findById(id);
    }

    public ChapterImageEntity Insert(ChapterImageEntity chapterImage) {return chapterImageRepository.save(chapterImage);}

    public ChapterImageEntity Update(ChapterImageEntity chapterImage) {
        return chapterImageRepository.save(chapterImage);}

    public void Delete(Long id) {
        chapterImageRepository.deleteById(id);}
}
