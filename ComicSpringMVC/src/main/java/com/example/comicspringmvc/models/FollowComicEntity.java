package com.example.comicspringmvc.models;

import javax.persistence.*;

@Entity
@Table(name = "FollowComic")
public class FollowComicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FollowComicId")
    private Long followComicId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Account", foreignKey = @ForeignKey(name = "FK_Follow_Account"))
    private AccountEntity account;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Comic", foreignKey = @ForeignKey(name = "FK_Follow_Comic"))
    private ComicEntity comic;

    public FollowComicEntity() {
    }

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

    @Override
    public String toString() {
        return "FollowComicEntity{" +
                "followComicId=" + followComicId +
                ", account=" + account +
                ", comic=" + comic +
                '}';
    }
}