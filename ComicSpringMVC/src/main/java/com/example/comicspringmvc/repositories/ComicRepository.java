
package com.example.comicspringmvc.repositories;

import com.example.comicspringmvc.models.ComicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComicRepository extends JpaRepository<ComicEntity, Long> {
}