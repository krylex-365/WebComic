package com.example.comicspringmvc.repositories;

import com.example.comicspringmvc.models.ChapterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterRepository extends JpaRepository<ChapterEntity, Long> {
}