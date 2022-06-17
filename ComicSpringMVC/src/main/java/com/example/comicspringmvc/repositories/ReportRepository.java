package com.example.comicspringmvc.repositories;

import com.example.comicspringmvc.models.ReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<ReportEntity, Long> {
}