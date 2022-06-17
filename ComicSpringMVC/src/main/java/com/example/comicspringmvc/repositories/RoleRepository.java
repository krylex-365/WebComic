package com.example.comicspringmvc.repositories;

import com.example.comicspringmvc.models.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
}