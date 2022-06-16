package com.example.comicspringmvc.models;

import javax.persistence.*;

@Entity
@Table(name = "FollowComic")
public class FollowComic {
    @Id
    @Column(name = "FollowComicDd", nullable = false)
    private Long followComicId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Account",foreignKey = @ForeignKey(name = "FK_Follow_Account"))
    private AccountEntity account;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Comic", foreignKey = @ForeignKey(name = "FK_Follow_Comic"))
    private ComicEntity comic;

    public ComicEntity getComic() {
        return comic;
    }

    public void setComic(ComicEntity comic) {
        this.comic = comic;
    }

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

    public Long getFollowComicId() {
        return followComicId;
    }

    public void setFollowComicId(Long id) {
        this.followComicId = id;
    }
}