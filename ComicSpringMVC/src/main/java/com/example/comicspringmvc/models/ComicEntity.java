package com.example.comicspringmvc.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Comic")
public class ComicEntity {
    @Id
    @Column(name = "ComicId", nullable = false)
    private Long comicId;

    @Column(name = "ComicName")
    private String comicName;

    @Column(name = "Descriptions")
    private String descriptions;

    @Column(name = "DateFrom")
    private LocalDate dateFrom;

    @Column(name = "DateTo")
    private LocalDate dateTo;

    @Column(name = "Dislike")
    private Integer dislike;

    @Column(name = "Like")
    private Integer like;

    @Column(name = "CountView")
    private Integer countView;

    @ManyToOne(optional = false)
    @JoinColumn(name = "author",foreignKey = @ForeignKey(name = "FK_Comic_Author"))
    private AuthorEntity authorEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "AccountId",foreignKey = @ForeignKey(name = "FK_Comic_Account"))
    private AccountEntity account;

    public AuthorEntity getAuthorEntity() {
        return authorEntity;
    }

    public void setAuthorEntity(AuthorEntity authorEntity) {
        this.authorEntity = authorEntity;
    }

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity accountEntity) {
        this.account = accountEntity;
    }

    public Integer getCountView() {
        return countView;
    }

    public void setCountView(Integer countView) {
        this.countView = countView;
    }

    public Integer getDislike() {
        return dislike;
    }

    public void setDislike(Integer dislike) {
        this.dislike = dislike;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getComicName() {
        return comicName;
    }

    public void setComicName(String name) {
        this.comicName = name;
    }


    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Long getComicId() {
        return comicId;
    }

    public void setComicId(Long id) {
        this.comicId = id;
    }
}