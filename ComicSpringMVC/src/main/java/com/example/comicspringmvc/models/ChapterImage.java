package com.example.comicspringmvc.models;

import javax.persistence.*;

@Entity
@Table(name = "chapter_image")
public class ChapterImage {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "URL")
    private String url;

    @ManyToOne(optional = false)
    @JoinColumn(name = "IdChapter",foreignKey = @ForeignKey(name = "FK_ChapterImage_Chapter"))
    private ChapterEntity idChapter;

    public ChapterEntity getIdChapter() {
        return idChapter;
    }

    public void setIdChapter(ChapterEntity idChapter) {
        this.idChapter = idChapter;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}