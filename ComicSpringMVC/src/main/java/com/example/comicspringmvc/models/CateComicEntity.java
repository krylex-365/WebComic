package com.example.comicspringmvc.models;

import javax.persistence.*;

@Entity
@Table(name = "CateComic")
public class CateComicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CateComicId")
    private Long cateComicId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "CategoryId",foreignKey = @ForeignKey(name = "FK_CateComic_Category"))
    private CategoryEntity category;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ComicId",foreignKey = @ForeignKey(name = "FK_CateComic_Comic"))
    private ComicEntity comic;

    public CateComicEntity() {
    }

    public Long getCateComicId() {
        return cateComicId;
    }

    public void setCateComicId(Long cateComicId) {
        this.cateComicId = cateComicId;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public ComicEntity getComic() {
        return comic;
    }

    public void setComic(ComicEntity comic) {
        this.comic = comic;
    }

    @Override
    public String toString() {
        return "CateComicEntity{" +
                "cateComicId=" + cateComicId +
                ", category=" + category +
                ", comic=" + comic +
                '}';
    }
}