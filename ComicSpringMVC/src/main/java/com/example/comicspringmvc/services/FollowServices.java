package com.example.comicspringmvc.services;

import com.example.comicspringmvc.models.CommentEntity;
import com.example.comicspringmvc.models.FollowEntity;
import com.example.comicspringmvc.repositories.FollowRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class FollowServices {

    @Autowired
    FollowRepository FollowRepository;

    public List<FollowEntity> FindAll() {
        return FollowRepository.findAll();
    }

    public Optional<FollowEntity> FindById(Long id) {
        return FollowRepository.findById(id);
    }

    public FollowEntity Insert(FollowEntity follow) {return FollowRepository.save(follow);}

    public FollowEntity Update(FollowEntity follow) {
        return FollowRepository.save(follow);}

    public void Delete(Long id) {
        FollowRepository.deleteById(id);}
}
