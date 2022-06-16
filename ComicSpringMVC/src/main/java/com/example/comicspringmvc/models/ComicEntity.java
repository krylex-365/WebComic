package com.example.comicspringmvc.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Comic")
public class ComicEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "Name")
    private String name;

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

    @OneToOne(optional = false)
    @JoinColumn(name = "AccountId",foreignKey = @ForeignKey(name = "FK_Comic_Account"))
    private AccountEntity Account;

    public AccountEntity getAccount() {
        return Account;
    }

    public void setAccount(AccountEntity accountEntity) {
        this.Account = accountEntity;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}