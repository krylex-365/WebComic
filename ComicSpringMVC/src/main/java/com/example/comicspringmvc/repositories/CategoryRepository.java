package com.example.comicspringmvc.repositories;

import com.example.comicspringmvc.models.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}