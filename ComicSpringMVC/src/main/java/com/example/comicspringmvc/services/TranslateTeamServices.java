package com.example.comicspringmvc.services;

import com.example.comicspringmvc.models.RoleEntity;
import com.example.comicspringmvc.models.TranslateTeamEntity;
import com.example.comicspringmvc.repositories.TranslateTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TranslateTeamServices {

    @Autowired
    TranslateTeamRepository translateTeamRepository;

    public List<TranslateTeamEntity> FindAll() {return translateTeamRepository.findAll();}

    public Optional<TranslateTeamEntity> FindById(Long id) {
        return translateTeamRepository.findById(id);
    }

    public TranslateTeamEntity Insert(TranslateTeamEntity translateTeam) {return translateTeamRepository.save(translateTeam);}

    public TranslateTeamEntity Update(TranslateTeamEntity translateTeam) {
        return translateTeamRepository.save(translateTeam);}

    public void Delete(Long id) {
        translateTeamRepository.deleteById(id);}
}
