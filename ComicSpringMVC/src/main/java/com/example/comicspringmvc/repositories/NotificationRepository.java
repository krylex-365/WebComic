package com.example.comicspringmvc.repositories;

import com.example.comicspringmvc.models.NotificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<NotificationEntity, Long> {
}