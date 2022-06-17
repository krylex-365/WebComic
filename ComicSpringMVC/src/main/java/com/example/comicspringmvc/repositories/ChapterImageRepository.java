package com.example.comicspringmvc.repositories;

import com.example.comicspringmvc.models.ChapterImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterImageRepository extends JpaRepository<ChapterImageEntity, Long> {
}