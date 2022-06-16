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
    @JoinColumn(name = "ComicId",foreignKey = @ForeignKey(name = "FK_Chapter_Comic"))
    private ComicEntity comic;

    @OneToOne(optional = false)
    @JoinColumn(name = "AccountId",foreignKey = @ForeignKey(name = "FK_Chapter_Account"))
    private AccountEntity account;

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity accountEntity) {
        this.account = accountEntity;
    }

    public ComicEntity getComic() {
        return comic;
    }

    public void setComic(ComicEntity idComic) {
        this.comic = idComic;
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