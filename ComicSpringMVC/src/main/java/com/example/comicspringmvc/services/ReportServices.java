package com.example.comicspringmvc.services;

import com.example.comicspringmvc.models.ReportEntity;
import com.example.comicspringmvc.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ReportServices {

    @Autowired
    ReportRepository reportRepository;

    public List<ReportEntity> FindAll() {
        return reportRepository.findAll();
    }

    public Optional<ReportEntity> FindById(Long id) {
        return reportRepository.findById(id);
    }

    public ReportEntity Insert(ReportEntity report) {return reportRepository.save(report);}

    public ReportEntity Update(ReportEntity report) {
        return reportRepository.save(report);}

    public void Delete(Long id) {
        reportRepository.deleteById(id);}
}
