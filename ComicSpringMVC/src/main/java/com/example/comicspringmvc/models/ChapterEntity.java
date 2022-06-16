package com.example.comicspringmvc.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "chapter_entity")
public class ChapterEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Date")
    private LocalDate date;

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}