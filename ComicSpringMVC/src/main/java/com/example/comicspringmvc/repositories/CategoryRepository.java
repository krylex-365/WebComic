package com.example.comicspringmvc.repositories;

import com.example.comicspringmvc.models.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
    @Query("select new com.example.comicspringmvc.models.CategoryEntity(c,count(cc.cateComicId)) from CategoryEntity c left join CateComicEntity cc on c=cc.category group by c")
    public List<CategoryEntity> GetAllCustom();
}