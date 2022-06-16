package com.example.comicspringmvc.models;

import javax.persistence.*;

@Entity
@Table(name = "ChapterImage")
public class ChapterImage {
    @Id
    @Column(name = "Imageid", nullable = false)
    private Long idImage;

    @Column(name = "URL")
    private String url;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ChapterId",foreignKey = @ForeignKey(name = "FK_ChapterImage_Chapter"))
    private ChapterEntity chapter;

    public ChapterEntity getChapter() {
        return chapter;
    }

    public void setChapter(ChapterEntity idChapter) {
        this.chapter = idChapter;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getIdImage() {
        return idImage;
    }

    public void setIdImage(Long id) {
        this.idImage = id;
    }
}