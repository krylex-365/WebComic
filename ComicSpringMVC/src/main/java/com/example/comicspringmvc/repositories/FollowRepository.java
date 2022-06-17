package com.example.comicspringmvc.repositories;

import com.example.comicspringmvc.models.FollowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository extends JpaRepository<FollowEntity, Long> {
}