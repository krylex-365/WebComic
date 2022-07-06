package com.example.comicspringmvc.repositories;

import com.example.comicspringmvc.models.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {


    @Query(value = "SELECT cc FROM AccountEntity cc WHERE cc.email = ?1")
    AccountEntity findByUsername(String email);

    /*@Query(value = "SELECT  FROM (SELECT * from account) a",nativeQuery = true)
    AccountEntity TEMP();*/
}