package com.example.comicspringmvc.services;

import com.example.comicspringmvc.models.RequestEntity;
import com.example.comicspringmvc.models.RoleEntity;
import com.example.comicspringmvc.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class RoleServices {

    @Autowired
    RoleRepository roleRepository;

    public List<RoleEntity> FindAll() {return roleRepository.findAll();}

    public Optional<RoleEntity> FindById(Long id) {
        return roleRepository.findById(id);
    }

    public RoleEntity Insert(RoleEntity role) {return roleRepository.save(role);}

    public RoleEntity Update(RoleEntity role) {
        return roleRepository.save(role);}

    public void Delete(Long id) {
        roleRepository.deleteById(id);}
}
