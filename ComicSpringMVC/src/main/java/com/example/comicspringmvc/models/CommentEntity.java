package com.example.comicspringmvc.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Comment")
public class CommentEntity {
    @Id
    @Column(name = "CommentId", nullable = false)
    private Long commentId;

    @Column(name = "Comment")
    private String comment;

    @Column(name = "Date")
    private LocalDate date;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ComicId", foreignKey = @ForeignKey(name = "FK_Comment_Comic"))
    private ComicEntity comic;

    @ManyToOne(optional = false)
    @JoinColumn(name = "AccountId", foreignKey = @ForeignKey(name = "FK_Comment_Account"))
    private AccountEntity Account;

    public AccountEntity getAccount() {
        return Account;
    }

    public void setAccount(AccountEntity accountEntity) {
        this.Account = accountEntity;
    }

    public ComicEntity getComic() {
        return comic;
    }

    public void setComic(ComicEntity comic) {
        this.comic = comic;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long id) {
        this.commentId = id;
    }
}