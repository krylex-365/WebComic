package com.example.comicspringmvc.repositories;

import com.example.comicspringmvc.models.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {
}