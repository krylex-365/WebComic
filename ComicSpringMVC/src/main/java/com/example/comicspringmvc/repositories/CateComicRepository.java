package com.example.comicspringmvc.repositories;

import com.example.comicspringmvc.models.CateComicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CateComicRepository extends JpaRepository<CateComicEntity, Long> {
}