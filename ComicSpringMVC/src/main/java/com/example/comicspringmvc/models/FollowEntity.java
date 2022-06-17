package com.example.comicspringmvc.models;

import javax.persistence.*;

@Entity
@Table(name = "Follow")
public class FollowEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FollowId")
    private Long followId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Account", foreignKey = @ForeignKey(name = "FK_Follow_Account"))
    private AccountEntity account;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Comic", foreignKey = @ForeignKey(name = "FK_Follow_Comic"))
    private ComicEntity comic;

    public FollowEntity() {
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

    public Long getFollowId() {
        return followId;
    }

    public void setFollowId(Long id) {
        this.followId = id;
    }

    @Override
    public String toString() {
        return "FollowComicEntity{" +
                "followId=" + followId +
                ", account=" + account +
                ", comic=" + comic +
                '}';
    }
}