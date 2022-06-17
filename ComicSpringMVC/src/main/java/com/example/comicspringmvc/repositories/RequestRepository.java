package com.example.comicspringmvc.repositories;

import com.example.comicspringmvc.models.RequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<RequestEntity, Long> {
}