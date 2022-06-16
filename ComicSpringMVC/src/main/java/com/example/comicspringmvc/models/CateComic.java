package com.example.comicspringmvc.models;

import javax.persistence.*;

@Entity
@Table(name = "CateComic")
public class CateComic {
    @Id
    @Column(name = "CateComicId", nullable = false)
    private Long cateComicId;

    @ManyToOne
    @JoinColumn(name = "CateId")
    private CategoriesEntity cate;

    public CategoriesEntity getCate() {
        return cate;
    }

    public void setCate(CategoriesEntity cateId) {
        this.cate = cateId;
    }

    public Long getCateComicId() {
        return cateComicId;
    }

    public void setCateComicId(Long id) {
        this.cateComicId = id;
    }
}