package com.example.comicspringmvc.models;

import javax.persistence.*;

@Entity
@Table(name = "CateComic")
public class CateComicEntity {
    @Id
    @Column(name = "CateComicId", nullable = false)
    private Long cateComicId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "CateId",foreignKey = @ForeignKey(name = "FK_CateComic_Cate"))
    private CategoriesEntity cate;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ComicId",foreignKey = @ForeignKey(name = "FK_CateComic_Comic"))
    private ComicEntity comic;

    public ComicEntity getComic() {
        return comic;
    }

    public void setComic(ComicEntity comic) {
        this.comic = comic;
    }

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