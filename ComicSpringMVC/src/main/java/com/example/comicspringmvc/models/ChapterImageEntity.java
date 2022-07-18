package com.example.comicspringmvc.models;

import javax.persistence.*;

@Entity
@Table(name = "ChapterImage")
public class ChapterImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ChapterImageId")
    private Long chapterImageId;



    @Column(name = "URL", nullable = false)
    private String url;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ChapterId", nullable = false, foreignKey = @ForeignKey(name = "FK_ChapterImage_Chapter"))
    private ChapterEntity chapter;

    public ChapterImageEntity() {
    }

    public Long getImageId() {
        return chapterImageId;
    }

    public void setImageId(Long chapterImageId) {
        this.chapterImageId = chapterImageId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ChapterEntity getChapter() {
        return chapter;
    }

    public void setChapter(ChapterEntity chapter) {
        this.chapter = chapter;
    }

    @Override
    public String toString() {
        return "ChapterImage{" +
                "chapterImageId=" + chapterImageId +
                ", url='" + url + '\'' +
                ", chapter=" + chapter +
                '}';
    }
}