package com.example.comicspringmvc.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Chapter")
public class ChapterEntity {
    @Id
    @Column(name = "IdChapter", nullable = false)
    private Long idChapter;

    @Column(name = "ChapterName")
    private String chapterName;

    @Column(name = "ReleaseDate")
    private LocalDate releaseDate;

    @ManyToOne(optional = false)
    @JoinColumn(name = "IdComic",foreignKey = @ForeignKey(name = "FK_Chapter_Comic"))
    private ComicEntity idComic;

    @OneToOne(optional = false)
    @JoinColumn(name = "IdAccount",foreignKey = @ForeignKey(name = "FK_Chapter_Account"))
    private AccountEntity accountEntity;

    public AccountEntity getAccountEntity() {
        return accountEntity;
    }

    public void setAccountEntity(AccountEntity accountEntity) {
        this.accountEntity = accountEntity;
    }

    public ComicEntity getIdComic() {
        return idComic;
    }

    public void setIdComic(ComicEntity idComic) {
        this.idComic = idComic;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate date) {
        this.releaseDate = date;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String name) {
        this.chapterName = name;
    }

    public Long getIdChapter() {
        return idChapter;
    }

    public void setIdChapter(Long id) {
        this.idChapter = id;
    }
}