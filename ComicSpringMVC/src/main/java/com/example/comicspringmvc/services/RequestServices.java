package com.example.comicspringmvc.services;

import com.example.comicspringmvc.models.ReportEntity;
import com.example.comicspringmvc.models.RequestEntity;
import com.example.comicspringmvc.repositories.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class RequestServices {

    @Autowired
    RequestRepository requestRepository;

    public List<RequestEntity> FindAll() {
        return requestRepository.findAll();
    }

    public Optional<RequestEntity> FindById(Long id) {
        return requestRepository.findById(id);
    }

    public RequestEntity Insert(RequestEntity request) {return requestRepository.save(request);}

    public RequestEntity Update(RequestEntity request) {
        return requestRepository.save(request);}

    public void Delete(Long id) {
        requestRepository.deleteById(id);}
}
