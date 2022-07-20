package com.example.comicspringmvc.repositories;

import com.example.comicspringmvc.models.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {
    @Query(value = "SELECT u FROM AuthorEntity u WHERE u.status = 1")
    List<AuthorEntity> GetAllActive();
}