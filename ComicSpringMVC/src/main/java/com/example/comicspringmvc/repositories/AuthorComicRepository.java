package com.example.comicspringmvc.repositories;

import com.example.comicspringmvc.models.AuthorComicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorComicRepository extends JpaRepository<AuthorComicEntity, Long> {
}