package com.example.comicspringmvc.services;

import com.example.comicspringmvc.models.FollowEntity;
import com.example.comicspringmvc.models.NotificationEntity;
import com.example.comicspringmvc.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class NotificationServices {

    @Autowired
    NotificationRepository notificationRepository;

    public List<NotificationEntity> FindAll() {
        return notificationRepository.findAll();
    }

    public Optional<NotificationEntity> FindById(Long id) {
        return notificationRepository.findById(id);
    }

    public NotificationEntity Insert(NotificationEntity notification) {return notificationRepository.save(notification);}

    public NotificationEntity Update(NotificationEntity notification) {
        return notificationRepository.save(notification);}

    public void Delete(Long id) {
        notificationRepository.deleteById(id);}
}
