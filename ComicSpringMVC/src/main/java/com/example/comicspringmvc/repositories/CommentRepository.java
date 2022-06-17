package com.example.comicspringmvc.repositories;

import com.example.comicspringmvc.models.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
}